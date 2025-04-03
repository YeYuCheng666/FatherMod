package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Lantern;

@SpirePatch(clz = Lantern.class, method = "atTurnStart")
public class LanternCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(Lantern __instance)
    {
        ++__instance.counter;
    }
}