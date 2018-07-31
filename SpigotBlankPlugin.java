package com.meeku.tutorialPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class SpigotBlankPlugin extends JavaPlugin implements Listener {
    // Fired when plugin is first enabled
	FileConfiguration config = getConfig();

    @Override
    public void onEnable() {
    	this.getCommand("info").setExecutor(new CommandInfo());
    	this.getCommand("on").setExecutor(new CommandFlyOn());
    	this.getCommand("fly on").setExecutor(new CommandFlyOn());
    	this.getCommand("off").setExecutor(new CommandFlyOff());
    	this.getCommand("fly off").setExecutor(new CommandFlyOff());
    	this.getCommand("reset").setExecutor(new CommandReset());
    	this.getCommand("health").setExecutor(new CommandHealth());
    	this.getCommand("god on").setExecutor(new CommandGodOn());
    	this.getCommand("god off").setExecutor(new CommandGodOff());
    	this.getCommand("essentialsadmin").setExecutor(new CommandEssentialsAdmin());
    	this.getCommand("ea").setExecutor(new CommandEssentialsAdmin());
    	this.getCommand("hey").setExecutor(new CommandHey());
    	this.getCommand("hello").setExecutor(new CommandHello());
    	this.getCommand("hi").setExecutor(new CommandHi());
    	this.getCommand("kit_admin").setExecutor(new CommandKitAdmin());
    	
        config.addDefault("datasave", true);
        config.options().copyDefaults(true);
        saveConfig();

       // Enable our class to check for new players using onPlayerJoin()
       getServer().getPluginManager().registerEvents(this, this);
    }
    
 // This method checks for incoming players and sends them a message
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (config.getBoolean("datasave")) {
            player.sendMessage("saved.");
            player.loadData();
            player.saveData();
        } else {
            player.sendMessage("not saved.");
        }
    }
    
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }
}
 