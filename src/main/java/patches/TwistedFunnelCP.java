package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.TwistedFunnel;

public class TwistedFunnelCP{
    @SpirePatch(clz = TwistedFunnel.class, method = SpirePatch.CONSTRUCTOR)
    public static class TwistedFunnelCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(TwistedFunnel __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = TwistedFunnel.class, method = "atBattleStart")
    public static class TwistedFunnelCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(TwistedFunnel __instance)
        {
            ++__instance.counter;
        }
    }
}

