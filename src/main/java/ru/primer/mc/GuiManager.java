package ru.primer.mc;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

public class GuiManager {
    public static Inventory mine = Bukkit.createInventory(null, 45,"§8Шахты");
    static {

        Main.getConstructors().items("§aШахта 1", 10, 1, Material.COAL);
        Main.getConstructors().items("§aШахта 2", 12, 1, Material.LAPIS_LAZULI);
        Main.getConstructors().items("§aШахта 3", 14, 1, Material.REDSTONE);
        Main.getConstructors().items("§aШахта 4", 16, 1, Material.EMERALD);
        Main.getConstructors().items("§aШахта 5", 30, 1, Material.DIAMOND);
        Main.getConstructors().items("§aШахта 6", 32, 1, Material.OBSIDIAN);

    }
}
