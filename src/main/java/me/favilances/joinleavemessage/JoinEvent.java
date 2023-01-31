package me.favilances.joinleavemessage;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        e.setJoinMessage(ChatColor.AQUA+player.getName()+" Joined the server!");
        player.sendMessage(ChatColor.GREEN+"Welcome to our "+ player.getName()+ " Server | MazeWW! \n Discord: discord.gg/favilances \n Instagram: instagram.com/favilances");
    }

}
