package ru.primer.mc;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

import static ru.primer.mc.GuiManager.mine;

public class Constructors {
    public void GuiItems(String displayName, List lore, Material material, int index, int amount) {
        if(lore != null) {
            ItemStack item = new ItemStack(material);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName(displayName);
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(amount);
            mine.setItem(index, new ItemStack(item));
        }
        else {
            ItemStack item = new ItemStack(material);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName(displayName);
            item.setItemMeta(itemMeta);
            item.setAmount(amount);
            mine.setItem(index, new ItemStack(item));
        }
    }
    public void mine(World world, double x, double y, double z, float yaw, float pitch, int shaftNumber, int index, Material material, Material eventMaterial, int eventIndex, Player p, String worldstr) {
        if (eventMaterial == material) {
            if (eventIndex == index) {
                if (p.hasPermission("minetp.use")) {
                    if ("world".equals(worldstr)) {
                        Location location = new Location(world, x, y, z, yaw, pitch);
                        p.teleport(location);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aВы были перемещены в шахту " + shaftNumber + "!"));
                        p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&6Перемещение..."), "", 10, 10, 10);
                    } else {
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cВы должны находиться в Лобби скайблока!"));
                    }
                } else {
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cВы должны иметь Шахтёрство 25 уровня для премещения!"));
                }
            }
        }
    }
    public void items(String displayName, int index, int amount, Material material) {
        List<String> lore_1 = new ArrayList<>();
        lore_1.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore_1.add(ChatColor.translateAlternateColorCodes('&', "&bНажмите, чтобы телепортироваться."));

        Main.getConstructors().GuiItems(displayName, lore_1, material, index, amount);
    }
}
