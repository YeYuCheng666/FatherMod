package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.SnakeRing;

@SpirePatch(clz = SnakeRing.class, method = "atBattleStart")
public class SnakeRingCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(SnakeRing __instance)
    {
        ++__instance.counter;
    }
}