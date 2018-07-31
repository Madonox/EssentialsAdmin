package com.meeku.tutorialPlugin;

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
            player.sendMessage("COMMANDS:");
            player.sendMessage("fly on");
            player.sendMessage("fly off");
            player.sendMessage("god on");
            player.sendMessage("god off");
            player.sendMessage("health");
            player.sendMessage("info");
            player.sendMessage("reset");
            player.sendMessage("essentialsadmin or ea");
            player.sendMessage("hello hi or hey");
            player.sendMessage("kit_admin");
        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}