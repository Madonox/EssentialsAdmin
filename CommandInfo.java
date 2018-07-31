package com.meeku.tutorialPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandInfo implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("plugin version: 1");
            player.sendMessage("plugin is ment for game version: 1.12.2");
        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}