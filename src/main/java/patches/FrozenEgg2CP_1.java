package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.FrozenEgg2;

@SpirePatch(clz = FrozenEgg2.class, method = SpirePatch.CONSTRUCTOR)
public class FrozenEgg2CP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(FrozenEgg2 __instance)
    {
        __instance.counter = 0;
    }
}