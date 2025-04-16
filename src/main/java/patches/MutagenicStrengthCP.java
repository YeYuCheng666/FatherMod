package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MutagenicStrength;

public class MutagenicStrengthCP{
    @SpirePatch(clz = MutagenicStrength.class, method = SpirePatch.CONSTRUCTOR)
    public static class MutagenicStrengthCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(MutagenicStrength __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = MutagenicStrength.class, method = "atBattleStart")
    public static class MutagenicStrengthCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(MutagenicStrength __instance)
        {
            ++__instance.counter;
        }
    }
}

