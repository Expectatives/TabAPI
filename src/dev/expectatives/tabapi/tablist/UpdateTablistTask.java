package dev.expectatives.tabapi.tablist;

import java.util.stream.Stream;

import org.bukkit.Bukkit;

public class UpdateTablistTask implements Runnable
{
	Tablist tablist;
	
    @Override
    public void run() {
        this.send();
    }
    
    @SuppressWarnings("deprecation")
	public void send() {
        final TablistManager manager = TablistManager.INSTANCE;
        if (manager != null) {
            Stream.of(Bukkit.getOnlinePlayers()).forEach(player -> {
                tablist = manager.getTablist(player);
                if (tablist != null) {
                    tablist.hideRealPlayers().update();
                }
            });
        }
    }
}
