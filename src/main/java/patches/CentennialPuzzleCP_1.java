package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.CentennialPuzzle;

@SpirePatch(clz = CentennialPuzzle.class, method = SpirePatch.CONSTRUCTOR)
public class CentennialPuzzleCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(CentennialPuzzle __instance)
    {
        __instance.counter = 0;
    }
}