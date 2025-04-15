package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.UnceasingTop;

@SpirePatch(clz = UnceasingTop.class, method = SpirePatch.CONSTRUCTOR)
public class UnceasingTopCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(UnceasingTop __instance)
    {
        __instance.counter = 0;
    }
}