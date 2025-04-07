package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MummifiedHand;

@SpirePatch(clz = MummifiedHand.class, method = SpirePatch.CONSTRUCTOR)
public class MummifiedHandCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(MummifiedHand __instance)
    {
        __instance.counter = 0;
    }
}