package dev.hepno.hepnosessentials;

import dev.hepno.hepnosessentials.commands.*;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class HepnosEssentials extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        getCommand("heal").setExecutor(new Heal());
        getCommand("feed").setExecutor(new Feed());
        getCommand("day").setExecutor(new Day());
        getCommand("time").setExecutor(new Time());

        getCommand("day").setExecutor(new Day());
        getCommand("noon").setExecutor(new Noon());
        getCommand("sunset").setExecutor(new Sunset());
        getCommand("night").setExecutor(new Night());
        getCommand("midnight").setExecutor(new Midnight());
        getCommand("sunrise").setExecutor(new Sunrise());

        getCommand("weather").setExecutor(new Weather());
        getCommand("sun").setExecutor(new Sun());
        getCommand("rain").setExecutor(new Rain());

        getCommand("gamemode").setExecutor(new Gamemode());
        getCommand("gmc").setExecutor(new Gmc());
        getCommand("gms").setExecutor(new Gms());
        getCommand("gmsp").setExecutor(new Gmsp());
        getCommand("gma").setExecutor(new Gma());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
