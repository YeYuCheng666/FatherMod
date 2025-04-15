package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BirdFacedUrn;

@SpirePatch(clz = BirdFacedUrn.class, method = SpirePatch.CONSTRUCTOR)
public class BirdFacedUrnCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(BirdFacedUrn __instance)
    {
        __instance.counter = 0;
    }
}