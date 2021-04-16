package dev.expectatives.tabapi.tablist;

import org.bukkit.entity.*;
import net.minecraft.util.com.google.common.collect.*;

public interface TablistInterfaze
{
    Table<Integer, Integer, String> getEntries(final Player p0);
    
    String getHeader(final Player p0);
    
    String getFooter(final Player p0);
}
