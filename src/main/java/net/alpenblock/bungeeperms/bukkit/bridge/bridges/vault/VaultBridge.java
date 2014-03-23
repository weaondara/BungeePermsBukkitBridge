/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.alpenblock.bungeeperms.bukkit.bridge.bridges.vault;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.alpenblock.bungeeperms.bukkit.bridge.Bridge;
import net.alpenblock.bungeeperms.bukkit.bridge.PluginBungeePermsBukkitBridge;
import net.milkbowl.vault.Vault;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.server.PluginDisableEvent;
import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.ServicePriority;

/**
 *
 * @author alex
 */
public class VaultBridge implements Bridge
{
    @Override
    public void enable()
    {
        Bukkit.getPluginManager().registerEvents(this, PluginBungeePermsBukkitBridge.getInstance());
        Bukkit.getLogger().info("Looking for Vault (enable)");
        Plugin plugin = Bukkit.getPluginManager().getPlugin("Vault");
        if(plugin!=null)
        {
            Bukkit.getLogger().info("Found Vault! (enable)");
            inject(plugin);
        }
    }
    @Override
    public void disable()
    {
        Bukkit.getPluginManager().registerEvents(this, PluginBungeePermsBukkitBridge.getInstance());
        Plugin plugin = Bukkit.getPluginManager().getPlugin("Vault");
        if(plugin!=null)
        {
            uninject(plugin);
        }

        PluginEnableEvent.getHandlerList().unregister(this);
        PluginDisableEvent.getHandlerList().unregister(this);
    }

    @EventHandler
    public void onPluginEnable(PluginEnableEvent e)
    {
        Bukkit.getLogger().info("Looking for Vault (onPluginEnable)");
        if(!e.getPlugin().getName().equalsIgnoreCase("vault"))
        {
            return;
        }
        Bukkit.getLogger().info("Found Vault! (onPluginEnable)");
        inject(e.getPlugin());
    }
    @EventHandler
    public void onPluginDisable(PluginDisableEvent e)
    {
        if(!e.getPlugin().getName().equalsIgnoreCase("vault"))
        {
            return;
        }
        uninject(e.getPlugin());
    }

    public void inject(Plugin plugin)
    {
        Bukkit.getLogger().info("["+PluginBungeePermsBukkitBridge.getInstance().getDescription().getName()+"] Injection of BungeepermsBukkit into Vault");
        try
        {
          Bukkit.getServicesManager().register(Permission.class, new Permission_BungeePermsBukkit(plugin), plugin, ServicePriority.Highest);
        } catch (Exception ex) {ex.printStackTrace();}
    }
    public void uninject(Plugin plugin)
    {
        Bukkit.getLogger().info("["+PluginBungeePermsBukkitBridge.getInstance().getDescription().getName()+"] Uninjection of BungeepermsBukkit into Vault");
    }
}
