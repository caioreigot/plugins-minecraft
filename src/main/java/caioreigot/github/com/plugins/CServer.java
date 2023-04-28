package caioreigot.github.com.plugins;

import org.bukkit.plugin.java.JavaPlugin;

public final class CServer extends JavaPlugin {

    // Plugin startup logic
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new PlayerMovementListener(), this);
        getServer().getPluginManager().registerEvents(new OnMobSpawnListener(), this);
        getServer().getPluginCommand("mark-location").setExecutor(new TowerCommandExecutor());
    }

    // Plugin shutdown logic
    @Override
    public void onDisable() {}
}
