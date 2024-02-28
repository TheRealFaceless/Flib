package net.faceless.flib.utilities;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

@SuppressWarnings("deprecation")
public class ChatUtil {
    public static Component format(String msg) {
        return MiniMessage.miniMessage().deserialize(msg);
    }

    public static String formatLegacy(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public static void sendMessage(Player player, String msg) {
        player.sendMessage(format(msg));
    }

    public static void sendLegacyMessage(Player player, String msg) {
        player.sendMessage(formatLegacy(msg));
    }

    public static void sendConsoleMessage(String msg) {
        Bukkit.getConsoleSender().sendMessage(format(msg));
    }

    public static void sendLegacyConsoleMessage(String msg) {
        Bukkit.getConsoleSender().sendMessage(formatLegacy(msg));
    }
}
