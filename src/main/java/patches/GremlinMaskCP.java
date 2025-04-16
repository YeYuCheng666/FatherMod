package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.GremlinMask;

public class GremlinMaskCP{
    @SpirePatch(clz = GremlinMask.class, method = SpirePatch.CONSTRUCTOR)
    public static class GremlinMaskCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(GremlinMask __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = GremlinMask.class, method = "atBattleStart")
    public static class GremlinMaskCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(GremlinMask __instance)
        {
            ++__instance.counter;
        }
    }
}

