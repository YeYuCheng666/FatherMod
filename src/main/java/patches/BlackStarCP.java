package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BlackStar;

public class BlackStarCP{
    @SpirePatch(clz = BlackStar.class, method = SpirePatch.CONSTRUCTOR)
    public static class BlackStarCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(BlackStar __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = BlackStar.class, method = "onVictory")
    public static class BlackStarCP_2
    {
        @SpireInsertPatch(rloc = 2)
        public static void Insert(BlackStar __instance)
        {
            ++__instance.counter;
        }
    }
}

