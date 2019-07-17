package erp.bukkit.additions;

import erp.bukkit.additions.commands.identity;
import erp.bukkit.additions.listeners.ListenerBukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ERPBukkit extends JavaPlugin {

	public static ERPBukkit instance;

	@Override
	public void onEnable() {
        ERPBukkit.instance = this;
		super.getServer().getPluginManager().registerEvents(new ListenerBukkit(), this);
		getCommand("identity").setExecutor(new identity());
	}

	@Override
	public void onDisable() {
	}



}