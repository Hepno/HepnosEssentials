package dev.hepno.hepnosessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Teleport implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0){
                player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Invalid arguments! Please mention a player to teleport to"));
                return true;
            }
            else if (args.length == 1) {
                Player target = Bukkit.getPlayer(args[0]);
                if (!(player instanceof Player)) {player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7That player does not exist.")); return true; }
                if (!(target instanceof Player)) {player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7That player does not exist.")); return true; }
                player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Invalid arguments! Please mention a second player"));
            }
            else if(args.length == 2){
                Player playerSent = Bukkit.getPlayer(args[0]);
                Player target = Bukkit.getPlayer(args[1]);
                if (!(playerSent instanceof Player)) {player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7That player does not exist.")); return true; }
                if (!(target instanceof Player)) {player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7That player does not exist.")); return true; }
                playerSent.teleport(target.getLocation());
                player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &dYou &7have been teleported to &d" + target.getName()));
                target.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &d" + player.getName() + " &7has teleported to &dyou"));
            }
        }
        return true;
    }
}
