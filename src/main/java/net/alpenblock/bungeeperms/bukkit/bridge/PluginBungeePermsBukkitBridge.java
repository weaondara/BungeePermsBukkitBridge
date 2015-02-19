package net.alpenblock.bungeeperms.bukkit.bridge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.alpenblock.bungeeperms.bukkit.bridge.bridges.vault.VaultBridge;
import net.alpenblock.bungeeperms.bukkit.bridge.bridges.worldedit.WorldEditBridge;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginBungeePermsBukkitBridge extends JavaPlugin implements Listener
{

    private static PluginBungeePermsBukkitBridge instance;

    public static PluginBungeePermsBukkitBridge getInstance()
    {
        return instance;
    }

    private Map<Class<? extends Bridge>, String> brigdesmap;
    private List<Bridge> bridges;

    @Override
    public void onLoad()
    {
        instance = this;

        brigdesmap = new HashMap<>();
        bridges = new ArrayList<>();

        brigdesmap.put(WorldEditBridge.class, "com.sk89q.worldedit.bukkit.WorldEditPlugin");
        brigdesmap.put(VaultBridge.class, "net.milkbowl.vault.Vault");

        for (Map.Entry<Class<? extends Bridge>, String> entry : brigdesmap.entrySet())
        {
            createBridge(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void onEnable()
    {
        for (Bridge b : bridges)
        {
            b.enable();
        }
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable()
    {
        PluginEnableEvent.getHandlerList().unregister((Listener) this);
        for (Bridge b : bridges)
        {
            b.disable();
        }
    }

    public Bridge createBridge(Class<? extends Bridge> c, String classname)
    {
        try
        {
            Class.forName(classname);
            Bridge b = c.newInstance();
            bridges.add(b);
            return b;
        }
        catch (Exception ex)
        {
        }
        return null;
    }

    @EventHandler
    public void onPluginEnable(PluginEnableEvent e)
    {
        for (Map.Entry<Class<? extends Bridge>, String> entry : brigdesmap.entrySet())
        {
            try
            {
                Class.forName(entry.getValue());
                for (Bridge b : bridges)
                {
                    if (b.getClass().getName().equals(entry.getKey().getName()))
                    {
                        throw new Exception();
                    }
                }
                createBridge(entry.getKey(), entry.getValue()).enable();
            }
            catch (Exception ex)
            {
            }
        }
    }
}
