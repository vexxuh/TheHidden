package com.mobius.thehidden;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class TheHidden extends JavaPlugin {

    private static final Logger log = Logger.getLogger(TheHidden.class.getName());

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "The Hidden Server has been Enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "The Hidden Server has been Disabled D:!");
    }


}
