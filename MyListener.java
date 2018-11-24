package me.Onariep.EssentialsAdmin;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MyListener implements Listener
{
     @EventHandler
     public void onPlayerJoin(PlayerJoinEvent event)
     {
    	 Player player = event.getPlayer();
    	 
    	 Material compass = Material.COMPASS;
    	 ItemStack item = new ItemStack(compass, 1);
    	 ItemMeta meta = item.getItemMeta();
    	 meta.setDisplayName(ChatColor.GREEN + "go to main world");
    	 
    	 List<String> lore = new ArrayList<String>();
    	 lore.add("teleports you to the main world and/or lobby");
    	 meta.setLore(lore);
    	 meta.setDisplayName(ChatColor.AQUA + "lobby");
    	 item.setItemMeta(meta);
    	 
    	 //gives the player the return to lobby compass when he or she joins
    	 player.getInventory().addItem(item);
    	 
    	 //sends a welcome message to 
         event.setJoinMessage("Welcome, " + event.getPlayer().getName() + "!");
     }
     @EventHandler
     public static void onInteract(PlayerInteractEvent event) {
    	 if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR) || event.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
    		 ItemStack item = event.getItem();
    		 if (item.getType().equals(Material.COMPASS)) {
    			 Player player = event.getPlayer();
        		 player.performCommand("lobby");
    		 }
    		 
    		 
    	 }
     }
}