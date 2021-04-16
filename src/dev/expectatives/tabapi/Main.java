package dev.expectatives.tabapi;

import org.bukkit.plugin.java.JavaPlugin;

import dev.expectatives.tabapi.tablist.TablistManager;
import dev.expectatives.tabapi.tablist.exampleadapter.TablistAdapter;

public class Main extends JavaPlugin{

	@SuppressWarnings("deprecation")
	public void onEnable(){
		new TablistManager(this, new TablistAdapter(), 500L);
	}
	public void onDisable(){
		
	}
}
