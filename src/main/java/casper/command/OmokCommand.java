package casper.command;

import casper.framework.BlockUtil;
import casper.plugin.Omok;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OmokCommand implements CommandExecutor
{
    Omok main;

    public OmokCommand() { }

    public OmokCommand(Omok main)
    {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        Player player = (Player) sender;
        String cmd = command.getName();

        if("createOmokTable".equals(cmd))
        {
            BlockUtil.CreateTable(player, Material.DRIED_KELP_BLOCK, 15, 1, 15);
        }

        return false;
    }
}