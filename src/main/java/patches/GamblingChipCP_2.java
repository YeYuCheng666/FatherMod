package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.GamblingChip;

@SpirePatch(clz = GamblingChip.class, method = "atTurnStartPostDraw")
public class GamblingChipCP_2
{
    @SpireInsertPatch(rloc = 3)
    public static void Insert(GamblingChip __instance)
    {
        ++__instance.counter;
    }
}