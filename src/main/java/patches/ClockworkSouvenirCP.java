package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.ClockworkSouvenir;

public class ClockworkSouvenirCP{
    @SpirePatch(clz = ClockworkSouvenir.class, method = SpirePatch.CONSTRUCTOR)
    public static class ClockworkSouvenirCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(ClockworkSouvenir __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = ClockworkSouvenir.class, method = "atBattleStart")
    public static class ClockworkSouvenirCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(ClockworkSouvenir __instance)
        {
            ++__instance.counter;
        }
    }
}

