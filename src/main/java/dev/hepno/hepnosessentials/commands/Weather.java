package dev.hepno.hepnosessentials.commands;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Weather implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("weather")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                World world = player.getWorld();

                if (args.length == 0) {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Invalid arguments"));
                    return true;
                }
                if (args[0].equalsIgnoreCase("clear")){
                    world.setStorm(false);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Set the weather in &a" + world.getName() + "&7 to &aClear"));
                    return true;
                }
                if (args[0].equalsIgnoreCase("rain")) {
                    world.setStorm(true);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Set the weather in &a" + world.getName() + "&7 to &aRain"));
                    return true;
                }
                if (args[0].equalsIgnoreCase("sun")){
                    world.setStorm(false);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Set the weather in &a" + world.getName() + "&7 to &aClear"));
                    return true;
                }
                if (args[0].equalsIgnoreCase("storm")) {
                    world.setStorm(true);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Set the weather in &a" + world.getName() + "&7 to &aStorm"));
                    return true;
                }
                player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Invalid arguments"));
                return true;
            }
            return true;
        }
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7This command can not be run via console"));
        return true;
    }
}