package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.FossilizedHelix;

@SpirePatch(clz = FossilizedHelix.class, method = "atBattleStart")
public class FossilizedHelixCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(FossilizedHelix __instance)
    {
        ++__instance.counter;
    }
}