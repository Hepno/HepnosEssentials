package dev.hepno.hepnosessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender.hasPermission("he.feed"))) {
            sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            return true;
        }

        Player player = (Player) sender;

        if (sender instanceof Player) {
            if (cmd.getName().equalsIgnoreCase("feed")) {
                if (args.length == 0) {
                    player.setFoodLevel(20);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Fed you to full Hunger!"));
                    return true;
                }
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target instanceof Player) {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Fed &a" + target.getDisplayName() + " &7to full Hunger!"));
                    target.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &a" + player.getDisplayName() + "&7 fed you full Hunger!"));
                    target.setFoodLevel(20);
                    return true;
                }
                player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7That player does not exist."));
                return true;
            }
        }
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7This command can not be run via console"));
        return true;
    }
}