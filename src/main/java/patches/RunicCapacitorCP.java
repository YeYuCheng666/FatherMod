package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.RunicCapacitor;

public class RunicCapacitorCP{
    @SpirePatch(clz = RunicCapacitor.class, method = SpirePatch.CONSTRUCTOR)
    public static class RunicCapacitorCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(RunicCapacitor __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = RunicCapacitor.class, method = "atTurnStart")
    public static class RunicCapacitorCP_2
    {
        @SpireInsertPatch(rloc = 2)
        public static void Insert(RunicCapacitor __instance)
        {
            ++__instance.counter;
        }
    }
}

