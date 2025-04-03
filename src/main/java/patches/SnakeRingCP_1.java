package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.SnakeRing;

@SpirePatch(clz = SnakeRing.class, method = SpirePatch.CONSTRUCTOR)
public class SnakeRingCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(SnakeRing __instance)
    {
        __instance.counter = 0;
    }
}