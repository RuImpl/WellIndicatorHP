package ru.impl.wellindicatorhp.command;

import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public interface ISubCommand {
    String Argument();
    boolean execute(@NotNull CommandSender sender, @NotNull String[] args);
}