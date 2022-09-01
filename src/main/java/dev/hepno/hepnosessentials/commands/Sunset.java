package dev.hepno.hepnosessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Sunset implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


        if (cmd.getName().equalsIgnoreCase("sunset")) {
            Player player = (Player) sender;
            World world = player.getWorld();
            world.setTime(12000);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Set the time to &aSunset in &a" + world.getName()));
            return true;
        }
        return true;
    }
}