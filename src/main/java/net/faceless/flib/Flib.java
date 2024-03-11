package net.faceless.flib;

import net.faceless.flib.configuration.ConfigManager;
import net.faceless.flib.listeners.MenuListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Flib extends JavaPlugin {

    @Override
    public void onEnable() {
        // Call these two methods in ur plugins main after shading.
        ConfigManager.getManager().register(this);
        getServer().getPluginManager().registerEvents(new MenuListener(), this);
    }
}
