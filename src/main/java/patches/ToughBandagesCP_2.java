package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.ToughBandages;

@SpirePatch(clz = ToughBandages.class, method = "onManualDiscard")
public class ToughBandagesCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(ToughBandages __instance)
    {
        ++__instance.counter;
    }
}