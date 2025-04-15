package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Duality;

@SpirePatch(clz = Duality.class, method = SpirePatch.CONSTRUCTOR)
public class DualityCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(Duality __instance)
    {
        __instance.counter = 0;
    }
}