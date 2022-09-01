package dev.hepno.hepnosessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Day implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


        if (cmd.getName().equalsIgnoreCase("day")) {
            Player player = (Player) sender;
            World world = player.getWorld();
            world.setTime(24000);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Set the time to &aDay in &a" + world.getName()));
            return true;
        }
        return true;
    }
}