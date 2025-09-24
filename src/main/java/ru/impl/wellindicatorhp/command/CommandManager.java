package ru.impl.wellindicatorhp.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import ru.impl.wellindicatorhp.Main;

import java.util.HashMap;
import java.util.Map;

public class CommandManager implements CommandExecutor {
    private final Map<String, ISubCommand> subCommands = new HashMap<>();
    private final Main plugin;

    public CommandManager(Main plugin) {
        this.plugin = plugin;
    }

    public void registerSubCommand(ISubCommand subCommand) {
        subCommands.put(subCommand.Argument().toLowerCase(), subCommand);
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player player)) return true;
        if (args.length == 0) {
            return true;
        }
        ISubCommand sub = subCommands.get(args[0].toLowerCase());
        if (sub == null) {
            return true;
        }
        return sub.execute(sender, args);
    }
}