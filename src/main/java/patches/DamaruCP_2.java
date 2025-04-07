package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Damaru;

@SpirePatch(clz = Damaru.class, method = "atTurnStart")
public class DamaruCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(Damaru __instance)
    {
        ++__instance.counter;
    }
}