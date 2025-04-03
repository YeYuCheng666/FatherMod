package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BagOfMarbles;

@SpirePatch(clz = BagOfMarbles.class, method = "atBattleStart")
public class BagOfMarblesCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(BagOfMarbles __instance)
    {
        ++__instance.counter;
    }
}