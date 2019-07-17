package erp.bukkit.additions.listeners;


import net.minecraft.entity.player.EntityPlayerMP;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import red.mohist.api.PlayerAPI;

public class ListenerBukkit implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		EntityPlayerMP playerMP = PlayerAPI.getNMSPlayer(event.getPlayer());
	}

	@EventHandler
	public void onQuit(PlayerQuitEvent event) {

	}


}