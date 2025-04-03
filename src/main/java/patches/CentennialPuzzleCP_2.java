package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.CentennialPuzzle;

@SpirePatch(clz = CentennialPuzzle.class, method = "wasHPLost", paramtypez = {int.class})
public class CentennialPuzzleCP_2
{
    @SpireInsertPatch(rloc = 4)
    public static void Insert(CentennialPuzzle __instance, int damage)
    {
        ++__instance.counter;
    }
}