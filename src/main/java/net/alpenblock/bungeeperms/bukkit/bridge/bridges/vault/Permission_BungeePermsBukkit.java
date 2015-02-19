package net.alpenblock.bungeeperms.bukkit.bridge.bridges.vault;

import java.util.ArrayList;
import java.util.List;
import net.alpenblock.bungeeperms.bukkit.BungeePerms;
import net.alpenblock.bungeeperms.bukkit.Group;
import net.alpenblock.bungeeperms.bukkit.User;
import net.milkbowl.vault.permission.Permission;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.server.PluginDisableEvent;
import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.plugin.Plugin;

public class Permission_BungeePermsBukkit extends Permission
{

    private final String name = "BungeePermsBukkit";
//    private BungeePerms plugin = null;
//
//    public Permission_BungeePermsBukkit(Plugin plugin) {
//        this.plugin = plugin;
//        Bukkit.getServer().getPluginManager().registerEvents(new PermissionServerListener(this), plugin);
//
//        // Load Plugin in case it was loaded before
//        if (permission == null) {
//            Plugin perms = plugin.getServer().getPluginManager().getPlugin("BungeePermsBukkit");
//            if (perms != null) {
//                if (perms.isEnabled()) {
//                    permission = (BungeePerms) perms;
//                    log.info(String.format("[%s][Permission] %s hooked.", plugin.getDescription().getName(), name));
//                }
//            }
//        }
//    }
//
//    @Override
//    public boolean isEnabled() {
//        if (permission == null) {
//            return false;
//        } else {
//            return permission.isEnabled();
//        }
//    }
//
//    @Override
//    public boolean playerInGroup(String worldName, String playerName, String groupName) {
//        User u = BungeePerms.getInstance().getPermissionsManager().getUser(playerName);
//        if (u == null) {
//            throw new NullPointerException("player " + playerName + " doesn't exist");
//        }
//        for (Group g : u.getGroups()) {
//            if (g.getName().equalsIgnoreCase(groupName)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public boolean hasGroupSupport() {
//        return true;
//    }
//
//    public class PermissionServerListener implements Listener {
//
//        Permission_BungeePermsBukkit permission = null;
//
//        public PermissionServerListener(Permission_BungeePermsBukkit permission) {
//            this.permission = permission;
//        }
//
//        @EventHandler(priority = EventPriority.MONITOR)
//        public void onPluginEnable(PluginEnableEvent event) {
//            if (permission.permission == null) {
//                Plugin perms = event.getPlugin();
//                if (perms.getDescription().getName().equals("BungeePermsBukkit")) {
//                    permission.permission = (BungeePerms) perms;
//                    log.info(String.format("[%s][Permission] %s hooked.", plugin.getDescription().getName(), permission.name));
//                }
//            }
//        }
//
//        @EventHandler(priority = EventPriority.MONITOR)
//        public void onPluginDisable(PluginDisableEvent event) {
//            if (permission.permission != null) {
//                if (event.getPlugin().getDescription().getName().equals("BungeePermsBukkit")) {
//                    permission.permission = null;
//                    log.info(String.format("[%s][Permission] %s un-hooked.", plugin.getDescription().getName(), permission.name));
//                }
//            }
//        }
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public boolean playerAddGroup(String worldName, String playerName, String groupName) {
//        throw new UnsupportedOperationException("BungeePerms permission operations are BungeeCord-only");
//    }
//
//    @Override
//    public String getPrimaryGroup(Player player)
//    {
//        return super.getPrimaryGroup(player); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public String getPrimaryGroup(String world, OfflinePlayer player)
//    {
//        return super.getPrimaryGroup(world, player); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public String getPrimaryGroup(World world, String player)
//    {
//        return super.getPrimaryGroup(world, player); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public String[] getPlayerGroups(Player player)
//    {
//        return super.getPlayerGroups(player); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public String[] getPlayerGroups(String world, OfflinePlayer player)
//    {
//        return super.getPlayerGroups(world, player); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public String[] getPlayerGroups(World world, String player)
//    {
//        return super.getPlayerGroups(world, player); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerRemoveGroup(Player player, String group)
//    {
//        return super.playerRemoveGroup(player, group); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerRemoveGroup(String world, OfflinePlayer player, String group)
//    {
//        return super.playerRemoveGroup(world, player, group); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerRemoveGroup(World world, String player, String group)
//    {
//        return super.playerRemoveGroup(world, player, group); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerAddGroup(Player player, String group)
//    {
//        return super.playerAddGroup(player, group); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerAddGroup(String world, OfflinePlayer player, String group)
//    {
//        return super.playerAddGroup(world, player, group); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerAddGroup(World world, String player, String group)
//    {
//        return super.playerAddGroup(world, player, group); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerInGroup(Player player, String group)
//    {
//        return super.playerInGroup(player, group); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerInGroup(String world, OfflinePlayer player, String group)
//    {
//        return super.playerInGroup(world, player, group); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerInGroup(World world, String player, String group)
//    {
//        return super.playerInGroup(world, player, group); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean groupRemove(World world, String group, String permission)
//    {
//        return super.groupRemove(world, group, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean groupAdd(World world, String group, String permission)
//    {
//        return super.groupAdd(world, group, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean groupHas(World world, String group, String permission)
//    {
//        return super.groupHas(world, group, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerRemoveTransient(OfflinePlayer player, String permission)
//    {
//        return super.playerRemoveTransient(player, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerRemove(Player player, String permission)
//    {
//        return super.playerRemove(player, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerRemove(World world, String player, String permission)
//    {
//        return super.playerRemove(world, player, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerRemove(String world, OfflinePlayer player, String permission)
//    {
//        return super.playerRemove(world, player, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerRemoveTransient(String worldName, OfflinePlayer player, String permission)
//    {
//        return super.playerRemoveTransient(worldName, player, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerAddTransient(String worldName, OfflinePlayer player, String permission)
//    {
//        return super.playerAddTransient(worldName, player, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerAddTransient(OfflinePlayer player, String permission) throws UnsupportedOperationException
//    {
//        return super.playerAddTransient(player, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerAdd(Player player, String permission)
//    {
//        return super.playerAdd(player, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerAdd(String world, OfflinePlayer player, String permission)
//    {
//        return super.playerAdd(world, player, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerAdd(World world, String player, String permission)
//    {
//        return super.playerAdd(world, player, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerHas(Player player, String permission)
//    {
//        return super.playerHas(player, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerHas(String world, OfflinePlayer player, String permission)
//    {
//        return super.playerHas(world, player, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean playerHas(World world, String player, String permission)
//    {
//        return super.playerHas(world, player, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean has(Player player, String permission)
//    {
//        return super.has(player, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean has(CommandSender sender, String permission)
//    {
//        return super.has(sender, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean has(World world, String player, String permission)
//    {
//        return super.has(world, player, permission); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean has(String world, String player, String permission)
//    {
//        return super.has(world, player, permission); //To change body of generated methods, choose Tools | Templates.
//    }

    protected Plugin plugin = null;
    protected Plugin perms = null;

    public Permission_BungeePermsBukkit(Plugin plugin)
    {
        this.plugin = plugin;
        Bukkit.getServer().getPluginManager().registerEvents(new PermissionServerListener(this), plugin);

        // Load Plugin in case it was loaded before
        if (perms == null)
        {
            perms = plugin.getServer().getPluginManager().getPlugin("BungeePermsBukkit");
            if (perms != null && perms.isEnabled())
            {
                log.info(String.format("[%s][Permission] %s hooked.", plugin.getDescription().getName(), name));
            }
        }
    }

    public class PermissionServerListener implements Listener
    {

        Permission_BungeePermsBukkit permission = null;

        public PermissionServerListener(Permission_BungeePermsBukkit permission)
        {
            this.permission = permission;
        }

        @EventHandler(priority = EventPriority.MONITOR)
        public void onPluginEnable(PluginEnableEvent event)
        {
            if (permission.perms == null)
            {
                Plugin perms = event.getPlugin();
                if (perms.getDescription().getName().equals("BungeePermsBukkit"))
                {
                    permission.perms = (BungeePerms) perms;
                    log.info(String.format("[%s][Permission] %s hooked.", plugin.getDescription().getName(), permission.name));
                }
            }
        }

        @EventHandler(priority = EventPriority.MONITOR)
        public void onPluginDisable(PluginDisableEvent event)
        {
            if (permission.plugin != null)
            {
                if (event.getPlugin().getDescription().getName().equals("BungeePermsBukkit"))
                {
                    permission.plugin = null;
                    log.info(String.format("[%s][Permission] %s un-hooked.", plugin.getDescription().getName(), permission.name));
                }
            }
        }
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public boolean isEnabled()
    {
        return perms == null ? false : perms.isEnabled();
    }

    @Override
    public boolean hasSuperPermsCompat()
    {
        return true;
    }

    @Override
    public boolean playerHas(String world, String player, String permission)
    {
        return BungeePerms.getInstance().getPermissionsManager().hasPermOrConsoleOnServerInWorld(player, permission, BungeePerms.getInstance().getServerName(), world);
    }

    @Override
    public boolean playerAdd(String world, String player, String permission)
    {
        return false;
    }

    @Override
    public boolean playerRemove(String world, String player, String permission)
    {
        return false;
    }

    @Override
    public boolean groupHas(String world, String group, String permission)
    {
        Group g = BungeePerms.getInstance().getPermissionsManager().getGroup(group);
        if (g == null)
        {
            throw new NullPointerException("group " + group + " doesn't exist");
        }

        return g.hasOnServerInWorld(permission, BungeePerms.getInstance().getServerName(), world);
    }

    @Override
    public boolean groupAdd(String world, String group, String permission)
    {
        return false;
    }

    @Override
    public boolean groupRemove(String world, String group, String permission)
    {
        return false;
    }

    @Override
    public boolean playerInGroup(String world, String player, String group)
    {
        User u = BungeePerms.getInstance().getPermissionsManager().getUser(player);
        if (u == null)
        {
            throw new NullPointerException("player " + player + " doesn't exist");
        }
        for (Group g : u.getGroups())
        {
            if (g.getName().equalsIgnoreCase(group))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean playerAddGroup(String world, String player, String group)
    {
        return false;
    }

    @Override
    public boolean playerRemoveGroup(String world, String player, String group)
    {
        return false;
    }

    @Override
    public String[] getPlayerGroups(String world, String player)
    {
        User u = BungeePerms.getInstance().getPermissionsManager().getUser(player);
        if (u == null)
        {
            throw new NullPointerException("player " + player + " doesn't exist");
        }
        List<String> groups = new ArrayList<>();
        for (Group g : u.getGroups())
        {
            groups.add(g.getName());
        }

        return groups.toArray(new String[groups.size()]);
    }

    @Override
    public String getPrimaryGroup(String world, String player)
    {
        User u = BungeePerms.getInstance().getPermissionsManager().getUser(player);
        if (u == null)
        {
            throw new NullPointerException("player " + player + " doesn't exist");
        }
        Group g = BungeePerms.getInstance().getPermissionsManager().getMainGroup(u);
        return g != null ? g.getName() : null;
    }

    @Override
    public String[] getGroups()
    {
        List<String> groups = new ArrayList<>();
        for (Group g : BungeePerms.getInstance().getPermissionsManager().getGroups())
        {
            groups.add(g.getName());
        }
        return groups.toArray(new String[groups.size()]);
    }

    @Override
    public boolean hasGroupSupport()
    {
        return true;
    }
}
