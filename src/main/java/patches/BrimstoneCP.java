package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Brimstone;

public class BrimstoneCP{
    @SpirePatch(clz = Brimstone.class, method = SpirePatch.CONSTRUCTOR)
    public static class BrimstoneCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(Brimstone __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = Brimstone.class, method = "atTurnStart")
    public static class BrimstoneCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(Brimstone __instance)
        {
            ++__instance.counter;
        }
    }
}

