package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.SelfFormingClay;

@SpirePatch(clz = SelfFormingClay.class, method = SpirePatch.CONSTRUCTOR)
public class SelfFormingClayCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(SelfFormingClay __instance)
    {
        __instance.counter = 0;
    }
}