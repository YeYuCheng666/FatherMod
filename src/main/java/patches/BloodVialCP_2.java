package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BloodVial;

@SpirePatch(clz = BloodVial.class, method = "atBattleStart")
public class BloodVialCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(BloodVial __instance)
    {
        ++__instance.counter;
    }
}