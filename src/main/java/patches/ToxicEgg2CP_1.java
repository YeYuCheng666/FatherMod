package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.ToxicEgg2;

@SpirePatch(clz = ToxicEgg2.class, method = SpirePatch.CONSTRUCTOR)
public class ToxicEgg2CP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(ToxicEgg2 __instance)
    {
        __instance.counter = 0;
    }
}