package me.ewilson.advancedMobGriefing;


import me.ewilson.advancedMobGriefing.commands.MobGriefingCommand;

import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;


public final class AdvancedMobGriefing extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();

        this.getServer().getPluginManager().registerEvents(new GriefingListener(this), this);

        PluginCommand command = this.getCommand("mobgriefing");
        if (command != null)
            command.setExecutor(new MobGriefingCommand(this));
    }

    @Override
    public void onDisable() {
        this.saveConfig();
    }

}
