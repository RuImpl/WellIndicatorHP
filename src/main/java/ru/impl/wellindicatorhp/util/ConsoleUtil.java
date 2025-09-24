package ru.impl.wellindicatorhp.util;

import org.bukkit.Bukkit;

public class ConsoleUtil {
    public static void color(String message) {
        Bukkit.getServer().getConsoleSender().sendMessage(Parser.translate(message));
    }

    public static void enable() {
        color("&x&F&B&A&D&0&0WellIndicatorHP");
        color("&fПлагин &x&6&8&F&B&1&9включен");
        color("&fСоздан благодаря студии - &x&F&B&6&A&2&3t.me/welldev");
    }

    public static void disable() {
        color("&x&F&B&A&D&0&0WellIndicatorHP");
        color("&fПлагин &x&F&B&2&6&1&1выключен");
    }
}
