package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Torii;

@SpirePatch(clz = Torii.class, method = SpirePatch.CONSTRUCTOR)
public class ToriiCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(Torii __instance)
    {
        __instance.counter = 0;
    }
}