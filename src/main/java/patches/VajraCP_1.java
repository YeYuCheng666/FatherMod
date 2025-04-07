package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Vajra;

@SpirePatch(clz = Vajra.class, method = SpirePatch.CONSTRUCTOR)
public class VajraCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(Vajra __instance)
    {
        __instance.counter = 0;
    }
}