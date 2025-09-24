package ru.impl.wellindicatorhp.command.args;

import me.neznamy.tab.shared.TAB;
import me.neznamy.tab.shared.features.belowname.BelowName;
import me.neznamy.tab.shared.platform.TabPlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import ru.impl.wellindicatorhp.command.ISubCommand;
import ru.impl.wellindicatorhp.Main;

public class OnArg implements ISubCommand {
    private final Main plugin;

    public OnArg(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public String Argument() {
        return "on";
    }

    @Override
    public boolean execute(@NotNull CommandSender sender, String[] args) {
        if (!(sender instanceof Player player)) return false;
        TabPlayer tabPlayer = TAB.getInstance().getPlayer(player.getUniqueId());
        if (tabPlayer == null) {
            return true;
        }
        BelowName belowNameFeature = (BelowName) TAB.getInstance().getFeatureManager().getFeature("BelowName");
        belowNameFeature.onDisableConditionChange(tabPlayer, false);
        return true;
    }
}