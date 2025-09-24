package ru.impl.wellindicatorhp;

import org.bukkit.plugin.java.JavaPlugin;
import ru.impl.wellindicatorhp.command.MainCommand;
import ru.impl.wellindicatorhp.util.ConsoleUtil;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        new MainCommand(this);
        ConsoleUtil.enable();
    }

    public void onDisable() {
        ConsoleUtil.disable();
    }
}
