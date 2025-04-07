package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MercuryHourglass;

@SpirePatch(clz = MercuryHourglass.class, method = "atTurnStart")
public class MercuryHourglassCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(MercuryHourglass __instance)
    {
        ++__instance.counter;
    }
}