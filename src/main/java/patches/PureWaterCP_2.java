package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.PureWater;

@SpirePatch(clz = PureWater.class, method = "atBattleStartPreDraw")
public class PureWaterCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(PureWater __instance)
    {
        ++__instance.counter;
    }
}