package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BronzeScales;

@SpirePatch(clz = BronzeScales.class, method = SpirePatch.CONSTRUCTOR)
public class BronzeScalesCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(BronzeScales __instance)
    {
        __instance.counter = 0;
    }
}