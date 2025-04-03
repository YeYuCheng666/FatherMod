package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.OddlySmoothStone;

@SpirePatch(clz = OddlySmoothStone.class, method = "atBattleStart")
public class OddlySmoothStoneCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(OddlySmoothStone __instance)
    {
        ++__instance.counter;
    }
}