package altitude.source.code;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	@Override
	public void onEnable() {
		getLogger().info("Watch-Dogs v1 has been enabled!"); 
		getServer().getPluginManager().registerEvents(this, this);
		new MainPhone(this);
	}
	@Override
	public void onDisable() {
		getLogger().info("Watch-Dogs v1 has been disabled!"); // Showing when the plugin has been disabled
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("watchtest")) { // Adding a dummy command
			sender.sendMessage(ChatColor.AQUA + "The dummy command works!"); // Sending an Aqua Message back to test if it works
			return true;
		}
		return false; 
		
		System.out.println("What is your name?");
		
		name = s.nextLine();
		
		System.out.println("Welcome to Watch_Blocks, " + name + "!");
		
		System.out.println("Shoot Maurice."); //First thing to do
		System.out.println("Sneak past the cops.");
		System.out.println("Hack the cameras."); //used to unlock the door 
		System.out.println("Lure the cop away."); //not to sure if we want to lure or kill but it says lure
		System.out.println("Reach the upper level.");
		System.out.println("Create the stadium blackout.");
		System.out.println("Sneak out of the stadium");
	}
}
