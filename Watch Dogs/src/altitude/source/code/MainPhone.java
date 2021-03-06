package altitude.source.code;

import org.bukkit.event.Listener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MainPhone implements Listener{
	public MainPhone(Main plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	public void openGUI(Player player) {
		Inventory inv = Bukkit.createInventory(null, 9, ChatColor.GOLD + "Hack Selector");
		
		ItemStack camera = new ItemStack(Material.GLASS);
		ItemMeta cameraMeta = camera.getItemMeta();
		ItemStack info = new ItemStack(Material.PAPER);
		ItemMeta infoMeta = info.getItemMeta();
		
		cameraMeta.setDisplayName(ChatColor.DARK_GREEN + "Security Camera");
		camera.setItemMeta(cameraMeta);
		
		infoMeta.setDisplayName(ChatColor.DARK_BLUE + "Personal Info");
		info.setItemMeta(cameraMeta);
		
		inv.setItem(3, camera);
		inv.setItem(4, info);
		
		player.openInventory(inv);
	}
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerJoin(PlayerJoinEvent event) {
		event.getPlayer().getInventory().addItem(new ItemStack(Material.COMPASS));
	}
	
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerInteract(PlayerInteractEvent event) {
		Action a = event.getAction();
		ItemStack is = event.getItem();
		
		if(a == Action.PHYSICAL || is == null || is.getType()==Material.AIR)
			return;
		
		if(is.getType()==Material.COMPASS);
			openGUI(event.getPlayer());
	}
	
	
	
	


}
