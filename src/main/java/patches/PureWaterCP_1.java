package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.PureWater;

@SpirePatch(clz = PureWater.class, method = SpirePatch.CONSTRUCTOR)
public class PureWaterCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(PureWater __instance)
    {
        __instance.counter = 0;
    }
}