package ru.impl.wellindicatorhp.command;

import ru.impl.wellindicatorhp.Main;
import ru.impl.wellindicatorhp.command.args.*;

public class MainCommand {
    public MainCommand(Main plugin) {
        CommandManager manager = new CommandManager(plugin);
        manager.registerSubCommand(new OnArg(plugin));
        manager.registerSubCommand(new OffArg(plugin));
        plugin.getCommand("hpindicator").setExecutor(manager);
    }
}