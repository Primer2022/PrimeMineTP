package ru.primer.mc;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import java.util.Collections;

public class GuiManager {
    public static Inventory mine = Bukkit.createInventory(null, 45,"§8Шахты");
    static {
        Main.getConstructors().items("§aШахта 1", 10, 1, Material.COAL);
        Main.getConstructors().items("§aШахта 2", 12, 1, Material.LAPIS_LAZULI);
        Main.getConstructors().items("§aШахта 3", 14, 1, Material.REDSTONE);
        Main.getConstructors().items("§aШахта 4", 16, 1, Material.EMERALD);
        Main.getConstructors().items("§aШахта 5", 30, 1, Material.DIAMOND);
        Main.getConstructors().items("§aШахта 6", 32, 1, Material.OBSIDIAN);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 0 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 1 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 2 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 3 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 4 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 5 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 6 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 7 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 8 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 9 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 10 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 17 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 18 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 26 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 27 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 35 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 36 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 37 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 38 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 39 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 40 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 41 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 42 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 43 , 1);
        Main.getConstructors().GuiItems(" ", Collections.singletonList(""), Material.CYAN_STAINED_GLASS_PANE, 44 , 1);

    }
}
