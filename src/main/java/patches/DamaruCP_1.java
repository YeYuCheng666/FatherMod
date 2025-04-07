package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Damaru;

@SpirePatch(clz = Damaru.class, method = SpirePatch.CONSTRUCTOR)
public class DamaruCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(Damaru __instance)
    {
        __instance.counter = 0;
    }
}