package ru.primer.mc;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

public class GuiListener implements Listener {

    @EventHandler
    public void onDrag(InventoryDragEvent e) {
        if (e.getView().getTitle() == "§8Шахты") {
                e.setCancelled(true);
        }
    }
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getView().getTitle() == "§8Шахты") {
            if (e.getCurrentItem() == null) {
                e.setCancelled(true);
                return;
            }
            else {
                e.setCancelled(true);
            }
            Player p = (Player) e.getWhoClicked();
            World world = p.getWorld();
            String worldstr = p.getWorld().getName();
            int slot = e.getSlot();
            Material eventMaterial = e.getCurrentItem().getType();
            Main.getConstructors().mine(world, -358.5, 100, 137.5, -90, 0, 1, 10, Material.COAL, eventMaterial, slot, p, worldstr);
            Main.getConstructors().mine(world, -358.5, 84, 137.5, -90, 0, 2, 12, Material.LAPIS_LAZULI, eventMaterial, slot, p, worldstr);
            Main.getConstructors().mine(world, -358.5, 69, 137.5, -90, 0, 3, 14, Material.REDSTONE, eventMaterial, slot, p, worldstr);
            Main.getConstructors().mine(world, -358.5, 53, 137.5, -90, 0, 4, 16, Material.EMERALD, eventMaterial, slot, p, worldstr);
            Main.getConstructors().mine(world, -358.5, 31, 137.5, -90, 0, 5, 30, Material.DIAMOND, eventMaterial, slot, p, worldstr);
            Main.getConstructors().mine(world, -358.5, 14, 137.5, -90, 0, 6, 32, Material.OBSIDIAN, eventMaterial, slot, p, worldstr);
        }
    }
}
