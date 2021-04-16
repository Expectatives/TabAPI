package dev.expectatives.tabapi.tablist.exampleadapter;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import dev.expectatives.tabapi.tablist.TablistInterfaze;
import net.minecraft.util.com.google.common.collect.HashBasedTable;
import net.minecraft.util.com.google.common.collect.Table;

public class TablistAdapter implements TablistInterfaze
{

//	If you want to add compatibility with PlaceholderAPI remove //
//	
//    private boolean usingPlaceholderApi;
//    
//    public TablistAdapter() {
//        this.usingPlaceholderApi = (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null);
//    }
    
    public String getVariables(final Player player, String path) {
    	
    //	If you want to add compatibility with PlaceholderAPI remove the // so that it replaces the variables
    //	
    //    if (this.usingPlaceholderApi) {
    //        path = PlaceholderAPI.setPlaceholders(player, path);
    //    }
    	
    	// Here an example to create variables:
    	
        if (path.contains("%player%")) {
            path = path.replace("%player%", player.getName());
        }
        return path;
    }
    
    @Override
    public Table<Integer, Integer, String> getEntries(final Player player) {
        final Table<Integer, Integer, String> entries = HashBasedTable.create();
        entries.put(0, 0, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-1")));
        entries.put(0, 1, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-2")));
        entries.put(0, 2, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-3")));
        entries.put(0, 3, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-4")));
        entries.put(0, 4, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-5")));
        entries.put(0, 5, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-6")));
        entries.put(0, 6, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-7")));
        entries.put(0, 7, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-8")));
        entries.put(0, 8, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-9")));
        entries.put(0, 9, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-10")));
        entries.put(0, 10, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-11")));
        entries.put(0, 11, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-12")));
        entries.put(0, 12, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-13")));
        entries.put(0, 13, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-14")));
        entries.put(0, 14, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-15")));
        entries.put(0, 15, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-16")));
        entries.put(0, 16, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-17")));
        entries.put(0, 17, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-18")));
        entries.put(0, 18, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-19")));
        entries.put(0, 19, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 1-20")));
        entries.put(1, 0, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-1")));
        entries.put(1, 1, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-2")));
        entries.put(1, 2, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-3")));
        entries.put(1, 3, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-4")));
        entries.put(1, 4, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-5")));
        entries.put(1, 5, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-6")));
        entries.put(1, 6, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-7")));
        entries.put(1, 7, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-8")));
        entries.put(1, 8, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-9")));
        entries.put(1, 9, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-10")));
        entries.put(1, 10, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-11")));
        entries.put(1, 11, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-12")));
        entries.put(1, 12, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-13")));
        entries.put(1, 13, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-14")));
        entries.put(1, 14, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-15")));
        entries.put(1, 15, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-16")));
        entries.put(1, 16, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-17")));
        entries.put(1, 17, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-18")));
        entries.put(1, 18, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-19")));
        entries.put(1, 19, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 2-20")));
        entries.put(2, 0, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-1")));
        entries.put(2, 1, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-2")));
        entries.put(2, 2, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-3")));
        entries.put(2, 3, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-4")));
        entries.put(2, 4, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-5")));
        entries.put(2, 5, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-6")));
        entries.put(2, 6, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-7")));
        entries.put(2, 7, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-8")));
        entries.put(2, 8, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-9")));
        entries.put(2, 9, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-10")));
        entries.put(2, 10, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-11")));
        entries.put(2, 11, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-12")));
        entries.put(2, 12, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-13")));
        entries.put(2, 13, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-14")));
        entries.put(2, 14, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-15")));
        entries.put(2, 15, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-16")));
        entries.put(2, 16, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-17")));
        entries.put(2, 17, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-18")));
        entries.put(2, 18, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-19")));
        entries.put(2, 19, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 3-20")));
        entries.put(3, 0, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-1")));
        entries.put(3, 1, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-2")));
        entries.put(3, 2, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-3")));
        entries.put(3, 3, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-4")));
        entries.put(3, 4, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-5")));
        entries.put(3, 5, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-6")));
        entries.put(3, 6, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-7")));
        entries.put(3, 7, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-8")));
        entries.put(3, 8, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-9")));
        entries.put(3, 9, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-10")));
        entries.put(3, 10, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-11")));
        entries.put(3, 11, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-12")));
        entries.put(3, 12, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-13")));
        entries.put(3, 13, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-14")));
        entries.put(3, 14, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-15")));
        entries.put(3, 15, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-16")));
        entries.put(3, 16, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-17")));
        entries.put(3, 17, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-18")));
        entries.put(3, 18, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-19")));
        entries.put(3, 19, TablistAdapter.translate(this.getVariables(player, "TABLIST LINE 4-20")));
        return entries;
    
    }
    
    @Override
    public String getHeader(final Player player) {
    	
    	// If you don't want a Header remove the "return ChatColor.....;" and put
    	// "return null;"
    	return TablistAdapter.translate("&9&lTABLIST HEADER");
    }
    
    @Override
    public String getFooter(final Player player) {
    	
    	// If you don't want a Footer remove the "return ChatColor.....;" and put
    	// "return null;"
    	return TablistAdapter.translate("&9&lTABLIST FOOTER");
    }
    
    // If you have a ColorTranslate Util, remove this and replace the translate with your Util.
    
    public static String translate(final String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
