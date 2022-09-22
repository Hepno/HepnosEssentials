package dev.hepno.hepnosessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Time implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender.hasPermission("he.time"))) {
            sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            return true;
        }

        if (sender instanceof Player) {
            Player player = (Player) sender;
            World world = player.getWorld();

            if (args.length == 0) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7The time in &a" + world.getTime() + " &7ticks."));
                return true;
            }
            if (args[0].equalsIgnoreCase("day")) {

                if (!(sender.hasPermission("he.time.day"))) {
                    sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                    return true;
                }

                world.setTime(24000);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Set the time to &aDay &7(&a24000&7) &7in " + world.getName()));
                return true;
            }
            if (args[0].equalsIgnoreCase("noon")) {

                if (!(sender.hasPermission("he.time.noon"))) {
                    sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                    return true;
                }

                world.setTime(6000);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Set the time to &aNoon &7(&a6000&7) &7in " + world.getName()));
                return true;
            }
            if (args[0].equalsIgnoreCase("sunset")) {

                if (!(sender.hasPermission("he.time.sunset"))) {
                    sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                    return true;
                }

                world.setTime(12000);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Set the time to &aSunset &7(&a12000&7) &7in " + world.getName()));
                return true;
            }
            if (args[0].equalsIgnoreCase("night")) {

                if (!(sender.hasPermission("he.time.night"))) {
                    sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                    return true;
                }

                world.setTime(13000);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Set the time to &aNight &7(&a13000&7) &7in " + world.getName()));
                return true;
            }
            if (args[0].equalsIgnoreCase("midnight")) {

                if (!(sender.hasPermission("he.time.midnight"))) {
                    sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                    return true;
                }

                world.setTime(18000);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Set the time to &aMidnight &7(&a18000&7) &7in " + world.getName()));
                return true;
            }
            if (args[0].equalsIgnoreCase("sunrise")) {

                if (!(sender.hasPermission("he.time.sunrise"))) {
                    sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                    return true;
                }

                world.setTime(23000);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Set the time to &aSunrise &7(&a23000&7) &7in " + world.getName()));
                return true;
            }
            if (args[0].equalsIgnoreCase("set")) {

                if (args.length == 0 || args.length == 1) {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Please specify a time."));
                    return true;
                }
                if (args[1].equalsIgnoreCase("day")) {

                    if (!(sender.hasPermission("he.time.day"))) {
                        sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                        return true;
                    }

                    world.setTime(24000);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Set the time to &aDay &7(&a24000&7) &7in " + world.getName()));
                    return true;
                }
                if (args[1].equalsIgnoreCase("noon")) {

                    if (!(sender.hasPermission("he.time.noon"))) {
                        sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                        return true;
                    }

                    world.setTime(6000);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Set the time to &aNoon &7(&a6000&7) &7in " + world.getName()));
                    return true;
                }
                if (args[1].equalsIgnoreCase("sunset")) {

                    if (!(sender.hasPermission("he.time.sunset"))) {
                        sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                        return true;
                    }

                    world.setTime(12000);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Set the time to &aSunset &7(&a12000&7) &7in " + world.getName()));
                    return true;
                }
                if (args[1].equalsIgnoreCase("night")) {

                    if (!(sender.hasPermission("he.time.night"))) {
                        sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                        return true;
                    }

                    world.setTime(13000);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Set the time to &aNight &7(&a13000&7) &7in " + world.getName()));
                    return true;
                }
                if (args[1].equalsIgnoreCase("midnight")) {

                    if (!(sender.hasPermission("he.time.midnight"))) {
                        sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                        return true;
                    }

                    world.setTime(18000);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Set the time to &aMidnight &7(&a18000&7) &7in " + world.getName()));
                    return true;
                }
                if (args[1].equalsIgnoreCase("sunrise")) {

                    if (!(sender.hasPermission("he.time.sunrise"))) {
                        sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                        return true;
                    }

                    world.setTime(23000);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Set the time to &aSunrise &7(&a23000&7) &7in " + world.getName()));
                    return true;
                }
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7That time does not exist."));
                return true;
            }
            return true;
        }
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7This command can not be run via console"));
        return true;
    }
}