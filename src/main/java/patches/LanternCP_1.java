package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Lantern;

@SpirePatch(clz = Lantern.class, method = SpirePatch.CONSTRUCTOR)
public class LanternCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(Lantern __instance)
    {
        __instance.counter = 0;
    }
}