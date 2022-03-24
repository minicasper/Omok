package casper.plugin;

import casper.command.OmokCommand;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Omok extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        OmokCommand omokCommand = new OmokCommand(this);
        getCommand("createOmokTable").setExecutor(omokCommand);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
