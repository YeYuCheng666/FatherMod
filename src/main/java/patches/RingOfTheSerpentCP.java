package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.RingOfTheSerpent;

public class RingOfTheSerpentCP{
    @SpirePatch(clz = RingOfTheSerpent.class, method = SpirePatch.CONSTRUCTOR)
    public static class RingOfTheSerpentCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(RingOfTheSerpent __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = RingOfTheSerpent.class, method = "atTurnStart")
    public static class RingOfTheSerpentCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(RingOfTheSerpent __instance)
        {
            ++__instance.counter;
        }
    }
}

