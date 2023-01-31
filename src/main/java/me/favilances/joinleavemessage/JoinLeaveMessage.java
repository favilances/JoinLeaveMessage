package me.favilances.joinleavemessage;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinLeaveMessage extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new JoinEvent(),this);
        Bukkit.getPluginManager().registerEvents(new QuitEvent(),this);
        System.out.println(ChatColor.GREEN+"[Favilances JoinLeaveMessage] Starting the plugin..");
    }
}
