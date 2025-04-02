package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BurningBlood;

@SpirePatch(clz = BurningBlood.class, method = "onVictory")
public class BurningBloodCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(BurningBlood __instance)
    {
        ++__instance.counter;
    }
}