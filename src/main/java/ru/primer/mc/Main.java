package ru.primer.mc;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Constructors constructors;

    @Override
    public void onEnable() {
        getCommand("mine").setExecutor(new CommandManager());
        getServer().getPluginManager().registerEvents(new GuiListener(), this);
        constructors = new Constructors();

    }

    public static Constructors getConstructors() {
        return constructors;
    }
}
