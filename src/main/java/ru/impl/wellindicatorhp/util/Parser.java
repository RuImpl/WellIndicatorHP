package ru.impl.wellindicatorhp.util;

import org.bukkit.ChatColor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public static String translate(String message) {
        Pattern hexPattern = Pattern.compile("&x(&#([0-9A-Fa-f]{6}))");
        Matcher matcher = hexPattern.matcher(message);
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            String hexColorCode = matcher.group(2);
            String coloredText = String.valueOf(ChatColor.COLOR_CHAR) + "x" + String.valueOf(ChatColor.COLOR_CHAR);
            for (char c : hexColorCode.toCharArray()) {
                coloredText += String.valueOf(ChatColor.COLOR_CHAR) + c;
            }

            matcher.appendReplacement(buffer, coloredText);
        }
        matcher.appendTail(buffer);
        return ChatColor.translateAlternateColorCodes('&', buffer.toString());
    }
}