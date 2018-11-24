package me.Onariep.EssentialsAdmin;
import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SpigotBlankPlugin extends JavaPlugin implements Listener {
    // Fired when plugin is first enabled
	FileConfiguration config = getConfig();
	File cfile;

    @Override
    public void onEnable() {
    	PluginManager pm = Bukkit.getServer().getPluginManager();
    	pm.registerEvents(new ListenerClass(), this);
    	
    	this.getLogger().info("Essentials Admin has finished loading.");
    	
    	this.getCommand("info").setExecutor(new CommandInfo());
    	this.getCommand("on").setExecutor(new CommandFlyOn());
    	this.getCommand("fly").setExecutor(new CommandFlyOn());
    	this.getCommand("off").setExecutor(new CommandUnFly());
    	this.getCommand("unfly").setExecutor(new CommandUnFly());
    	this.getCommand("reset").setExecutor(new CommandReset());
    	this.getCommand("health").setExecutor(new CommandHealth());
    	this.getCommand("god").setExecutor(new CommandGodOn());
    	this.getCommand("ungod").setExecutor(new CommandGodOff());
    	this.getCommand("essentialsadmin").setExecutor(new CommandEssentialsAdmin());
    	this.getCommand("ea").setExecutor(new CommandEssentialsAdmin());
    	this.getCommand("hey").setExecutor(new CommandHey());
    	this.getCommand("hello").setExecutor(new CommandHello());
    	this.getCommand("hi").setExecutor(new CommandHi());
    	this.getCommand("kit_admin").setExecutor(new CommandKitAdmin());
    	this.getCommand("noclip").setExecutor(new CommandNoclip());
    	this.getCommand("unnoclip").setExecutor(new CommandUnNoclip());
    	this.getCommand("sit").setExecutor(new CommandSit());
    	this.getCommand("stand").setExecutor(new CommandUnSit());
    	
        config.addDefault("datasave", true);
        config.options().copyDefaults(true);
        this.saveDefaultConfig();
        cfile = new File(getDataFolder(), "config.yml");

       // Enable our class to check for new players using onPlayerJoin()
        getServer().getPluginManager().registerEvents(new MyListener(), this);
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("lobby")) {
        	if (sender instanceof Player) {
                Player player = (Player) sender;
                int x = (int) this.getConfig().getInt("lobby.x");
                int y = (int) this.getConfig().getInt("lobby.y");
                int z = (int) this.getConfig().getInt("lobby.z");
                World world = Bukkit.getWorld(this.getConfig().getString("lobby.world"));
                
                Location loc = new Location(world, x, y, z);
                player.teleport(loc);
            }

            // If the player (or console) uses our command correct, we can return true
            
        }
        return true;
    }
    
    
    // Fired when plugin is disabled
    @Override
    public void onDisable() {
    	this.getLogger().info("Essentials Admin has shut down.");

    }
}
 