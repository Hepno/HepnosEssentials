package dev.hepno.hepnosessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

public class Heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("heal")) {
            if (sender instanceof Player) {
                if (args.length == 0) {
                    double maxHealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
                    player.setHealth(maxHealth);
                    player.setFoodLevel(20);
                    player.setFireTicks(0);
                    for (PotionEffect effect : player.getActivePotionEffects())
                        player.removePotionEffect(effect.getType());
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Healed you to full HP!"));
                    return true;
                }
                if (args.length > 0) {
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if (target instanceof Player) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Healed &a" + target.getDisplayName() + " &7to full HP!"));
                        target.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &a" + player.getDisplayName() + "&7 healed you full HP!"));
                        target.setHealth(target.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue());
                        target.setFireTicks(0);
                        for (PotionEffect effect : target.getActivePotionEffects())
                            target.removePotionEffect(effect.getType());
                        return true;
                    }
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7That player does not exist."));
                    return true;
                }
                return true;
            }
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&d&lHepnosEssentials &8» &7This command can not be run via console"));
            return true;
        }
        return true;
    }
}