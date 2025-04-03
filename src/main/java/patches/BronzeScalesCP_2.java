package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BronzeScales;

@SpirePatch(clz = BronzeScales.class, method = "atBattleStart")
public class BronzeScalesCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(BronzeScales __instance)
    {
        ++__instance.counter;
    }
}