package dev.hepno.hepnosessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Lightning implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) { return true; }
        Player player = (Player) sender;
        if (args.length == 0) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7You must specify a player to cast lightning on!"));
            return true;
        }
        Player target = Bukkit.getPlayer(args[0]);
        if (!(target instanceof Player)) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7That player does not exist."));
            return true;
        }
        if (args.length == 1) {
            World world = player.getWorld();
            world.strikeLightning(target.getLocation());
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7&dYou &7have struck lightning on &d" + target.getName()));
            target.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &dYou&7 have been struck by lightning."));
            return true;
        }
        return true;
    }
}
