package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BurningBlood;

@SpirePatch(clz = BurningBlood.class, method = SpirePatch.CONSTRUCTOR)
public class BurningBloodCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(BurningBlood __instance)
    {
        __instance.counter = 0;
    }
}