package dev.hepno.hepnosessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fire implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Please provide arguments!"));
                return true;
            } else if (args.length == 1) {
                Player target = Bukkit.getPlayer(args[0]);
                if (!(target instanceof Player)) {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7That player does not exist."));
                    return true;
                }
                target.setFireTicks(60);
                target.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &dYou &7have been lit on fire by &d" + player.getName()));
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &dYou&7 have lit &d" + target.getName() + " &7on fire."));
                return true;
            }
            return true;
        }
        return true;
    }
}
