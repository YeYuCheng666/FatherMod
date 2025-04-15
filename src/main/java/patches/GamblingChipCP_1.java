package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.GamblingChip;

@SpirePatch(clz = GamblingChip.class, method = SpirePatch.CONSTRUCTOR)
public class GamblingChipCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(GamblingChip __instance)
    {
        __instance.counter = 0;
    }
}