package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BlackBlood;

public class BlackBloodCP{
    @SpirePatch(clz = BlackBlood.class, method = SpirePatch.CONSTRUCTOR)
    public static class BlackBloodCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(BlackBlood __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = BlackBlood.class, method = "onVictory")
    public static class BlackBloodCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(BlackBlood __instance)
        {
            ++__instance.counter;
        }
    }
}

