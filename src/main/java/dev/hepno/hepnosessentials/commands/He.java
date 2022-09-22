package dev.hepno.hepnosessentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class He implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender.hasPermission("he"))) {
            sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            return true;
        }

        if (cmd.getName().equalsIgnoreCase("he")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;

                if (args.length == 0) {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Run &a/he help&7 for a list of commands"));
                    return true;
                }

                if (args[0].equalsIgnoreCase("help")) {

                    if (!(sender.hasPermission("he.help"))) {
                        sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                        return true;
                    }

                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7&m                                  "));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&dHepnosEssentials Help:"));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7&m                                  "));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d/gamemode <&7Mode&d> <&7Player&d> &8➥ &7Set a players gamemode"));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d/time <&7Time&d> &8➥ &7Set the time"));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d/weather <&7Weather&d> &8➥ &7Set the weather"));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d/kill <&7Player&d> &8➥ &7Kill a player"));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d/heal <&7Player&d> &8➥ &7Heal a player to full health"));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d/feed <&7Player&d> &8➥ &7Feed a player to full hunger"));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7&m                                  "));
                }

                return true;
            }
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7This command cannot be ran via console"));
            return true;
        }
        return true;
    }
}
