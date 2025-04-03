package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.DataDisk;

@SpirePatch(clz = DataDisk.class, method = SpirePatch.CONSTRUCTOR)
public class DataDiskCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(DataDisk __instance)
    {
        __instance.counter = 0;
    }
}