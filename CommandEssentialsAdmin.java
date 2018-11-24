package me.Onariep.EssentialsAdmin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandEssentialsAdmin implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.AQUA + "COMMANDS:");
            player.sendMessage(ChatColor.GOLD + "fly");
            player.sendMessage(ChatColor.GOLD + "unfly");
            player.sendMessage(ChatColor.GOLD + "god");
            player.sendMessage(ChatColor.GOLD + "ungod");
            player.sendMessage(ChatColor.GOLD + "health");
            player.sendMessage(ChatColor.GOLD + "info");
            player.sendMessage(ChatColor.GOLD + "reset");
            player.sendMessage(ChatColor.GOLD + "essentialsadmin or ea");
            player.sendMessage(ChatColor.GOLD + "hello hi or hey");
            player.sendMessage(ChatColor.GOLD + "kit_admin");
            player.sendMessage(ChatColor.GOLD + "noclip");
            player.sendMessage(ChatColor.GOLD + "unnoclip");
        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}