package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Tingsha;

@SpirePatch(clz = Tingsha.class, method = "onManualDiscard")
public class TingshaCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(Tingsha __instance)
    {
        ++__instance.counter;
    }
}