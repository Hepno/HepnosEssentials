package dev.hepno.hepnosessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("heal")) {
            if (args.length == 0) {
                double maxHealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
                player.setHealth(maxHealth);
                player.setFoodLevel(20);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Healed you to full HP!"));
                return true;
            }
            Player target = Bukkit.getPlayerExact(args[0]);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &7Healed &a" + target.getDisplayName() + " &7to full HP!"));
                target.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&lHepnosEssentials &8» &a" + player.getDisplayName() + "&7 healed you full HP!"));
                target.setHealth(target.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue());
                return true;
        }
        return true;
    }
}