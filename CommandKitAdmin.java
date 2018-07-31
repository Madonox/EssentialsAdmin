package com.meeku.tutorialPlugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandKitAdmin implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack diamond_sword = new ItemStack(Material.LEGACY_DIAMOND_SWORD);
            ItemStack diamond_helm = new ItemStack(Material.LEGACY_DIAMOND_HELMET);
            ItemStack diamond_chest = new ItemStack(Material.LEGACY_DIAMOND_CHESTPLATE);
            ItemStack diamond_leg = new ItemStack(Material.LEGACY_DIAMOND_LEGGINGS);
            ItemStack diamond_boot = new ItemStack(Material.LEGACY_DIAMOND_BOOTS);
            player.getInventory().addItem(diamond_sword, diamond_helm, diamond_chest, diamond_leg, diamond_boot);
        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}