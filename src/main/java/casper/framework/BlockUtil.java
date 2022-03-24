package casper.framework;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class BlockUtil {
    public static void CreateTable(Player player, Material material, int xCnt, int yCnt, int zCnt)
    {
        World world = player.getWorld();
        Location location = player.getLocation();
        double x = location.getX();
        double y = location.getY();
        double z = location.getZ();

        for (double ix = x; ix < x + xCnt; ix++)
            for (double iy = y; iy < y + yCnt; iy++)
                for (double iz = z; iz < z + zCnt; iz++)
                    world.getBlockAt((int)ix, (int)iy, (int)iz).setType(material);
    }
}
