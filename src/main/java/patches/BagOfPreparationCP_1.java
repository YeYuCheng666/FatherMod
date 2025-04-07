package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BagOfPreparation;

@SpirePatch(clz = BagOfPreparation.class, method = SpirePatch.CONSTRUCTOR)
public class BagOfPreparationCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(BagOfPreparation __instance)
    {
        __instance.counter = 0;
    }
}