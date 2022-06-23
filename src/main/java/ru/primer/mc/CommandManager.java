package ru.primer.mc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;


public class CommandManager implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender s, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        if (!(s instanceof Player)) {
            s.sendMessage(ChatColor.RED + "Используйте команды от имени игрока!");
            return true;
        }
        Player p = (Player) s;
        switch (args[0]) {
            case ("menu"):
                if (p.hasPermission("minetp.use")) {
                    p.openInventory(GuiManager.mine);
                    break;
                }
                return true;
        }
    return true;
    }
}