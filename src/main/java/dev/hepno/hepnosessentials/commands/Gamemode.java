package dev.hepno.hepnosessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(!(sender.hasPermission("he.gamemode"))) {
            sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            return true;
        }

        if (cmd.getName().equalsIgnoreCase("gamemode")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;

                //      /Gamemode Survival
                if (args.length == 0) { player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Invalid arguments")); return true; }
                if (args[0].equalsIgnoreCase("survival")) {
                    if (!(sender.hasPermission("he.gamemode.survival"))) {
                        sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                        return true;
                    }
                    if (args.length == 1) {
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Set your game mode to &aSurvival"));
                        return true;
                    }
                    Player target = Bukkit.getPlayerExact(args[1]);
                    target.setGameMode(GameMode.SURVIVAL);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Set &a" + target.getName() + "&7's gamemode to &aSurvival"));
                    target.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &a" + player.getName() + "&7 set your game mode to &aSurvival"));
                }

                //      /Gamemode Creative
                if (args.length == 0) { player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Invalid arguments")); return true; }
                if (args[0].equalsIgnoreCase("creative")) {
                    if (!(sender.hasPermission("he.gamemode.creative"))) {
                        sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                        return true;
                    }
                    if (args.length == 1) {
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Set your game mode to &aCreative"));
                        return true;
                    }
                    Player target = Bukkit.getPlayerExact(args[1]);
                    target.setGameMode(GameMode.CREATIVE);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Set &a" + target.getName() + "&7's gamemode to &aCreative"));
                    target.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &a" + player.getName() + "&7 set your game mode to &aCreative"));
                }

                //      /Gamemode Spectator
                if (args.length == 0) { player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Invalid arguments")); return true; }
                if (args[0].equalsIgnoreCase("spectator")) {
                    if (!(sender.hasPermission("he.gamemode.spectator"))) {
                        sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                        return true;
                    }
                    if (args.length == 1) {
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Set your game mode to &aSpectator"));
                        return true;
                    }
                    Player target = Bukkit.getPlayerExact(args[1]);
                    target.setGameMode(GameMode.SPECTATOR);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Set &a" + target.getName() + "&7's gamemode to &aSpectator"));
                    target.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &a" + player.getName() + "&7 set your game mode to &aSpectator"));
                }

                //      /Gamemode Adventure
                if (args.length == 0) { player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Invalid arguments")); return true; }
                if (args[0].equalsIgnoreCase("adventure")) {
                    if (!(sender.hasPermission("he.gamemode.adventure"))) {
                        sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                        return true;
                    }
                    if (args.length == 1) {
                        player.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Set your game mode to &aAdventure"));
                        return true;
                    }
                    Player target = Bukkit.getPlayerExact(args[1]);
                    target.setGameMode(GameMode.ADVENTURE);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7Set &a" + target.getName() + "&7's gamemode to &aAdventure"));
                    target.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &a" + player.getName() + "&7 set your game mode to &aAdventure"));
                }

                return true;
            }
            return true;
        }
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7This command can not be run via console"));
        return true;
    }
}
