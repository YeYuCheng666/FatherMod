package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.UnceasingTop;

@SpirePatch(clz = UnceasingTop.class, method = "onRefreshHand")
public class UnceasingTopCP_2
{
    @SpireInsertPatch(rloc = 6)
    public static void Insert(UnceasingTop __instance)
    {
        ++__instance.counter;
    }
}