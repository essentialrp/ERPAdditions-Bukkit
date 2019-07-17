package erp.bukkit.additions.commands;



import erp.bukkit.additions.message.MessageUtils;
import erp.forge.core.player.ERPlayer;
import erp.forge.core.player.EnumProfile;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class identity implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        final Player player = ((Player) sender).getPlayer();
        ERPlayer erPlayer = new ERPlayer(player.getUniqueId());
        player.sendMessage(MessageUtils.getCenteredMessage("&7Identitée de &c"+erPlayer.get(EnumProfile.FIRSTNAME)));
        player.sendMessage("§7Nom: §c"+erPlayer.get(EnumProfile.LASTNAME));
        player.sendMessage("§7Age: §a"+erPlayer.get(EnumProfile.AGE));
        player.sendMessage("§7Job: §a"+erPlayer.get(EnumProfile.JOB));
        player.sendMessage("§7Bank: §a"+erPlayer.get(EnumProfile.BANK)+"$");
        player.sendMessage("§7Money: §a"+erPlayer.get(EnumProfile.MONEY)+"$");

        return false;
    }
}