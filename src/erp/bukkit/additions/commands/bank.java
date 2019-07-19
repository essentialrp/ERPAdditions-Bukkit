package erp.bukkit.additions.commands;

import erp.forge.core.player.ERPlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class bank implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        final Player player = ((Player) sender).getPlayer();
        ERPlayer erPlayer = new ERPlayer(player.getUniqueId());

        boolean minus = Boolean.valueOf(args[0]);
        int money = Integer.parseInt(args[1]);

        if (minus) {
            erPlayer.removeBank(money);
        } else {
            erPlayer.addBank(money);
        }
        return false;
    }
}