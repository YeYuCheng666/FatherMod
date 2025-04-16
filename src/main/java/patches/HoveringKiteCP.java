package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.HoveringKite;

public class HoveringKiteCP{
    @SpirePatch(clz = HoveringKite.class, method = SpirePatch.CONSTRUCTOR)
    public static class HoveringKiteCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(HoveringKite __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = HoveringKite.class, method = "onManualDiscard")
    public static class HoveringKiteCP_2
    {
        @SpireInsertPatch(rloc = 3)
        public static void Insert(HoveringKite __instance)
        {
            ++__instance.counter;
        }
    }
}

