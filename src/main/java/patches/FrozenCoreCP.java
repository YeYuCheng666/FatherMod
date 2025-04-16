package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.FrozenCore;

public class FrozenCoreCP{
    @SpirePatch(clz = FrozenCore.class, method = SpirePatch.CONSTRUCTOR)
    public static class FrozenCoreCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(FrozenCore __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = FrozenCore.class, method = "onPlayerEndTurn")
    public static class FrozenCoreCP_2
    {
        @SpireInsertPatch(rloc = 2)
        public static void Insert(FrozenCore __instance)
        {
            ++__instance.counter;
        }
    }
}

