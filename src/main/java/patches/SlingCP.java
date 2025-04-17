package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Sling;

public class SlingCP{
    @SpirePatch(clz = Sling.class, method = SpirePatch.CONSTRUCTOR)
    public static class SlingCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(Sling __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = Sling.class, method = "atBattleStart")
    public static class SlingCP_2
    {
        @SpireInsertPatch(rloc = 2)
        public static void Insert(Sling __instance)
        {
            ++__instance.counter;
        }
    }
}

