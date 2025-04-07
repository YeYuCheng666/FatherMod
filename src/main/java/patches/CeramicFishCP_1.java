package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.CeramicFish;

@SpirePatch(clz = CeramicFish.class, method = SpirePatch.CONSTRUCTOR)
public class CeramicFishCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(CeramicFish __instance)
    {
        __instance.counter = 0;
    }
}