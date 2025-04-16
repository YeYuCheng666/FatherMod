package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.NuclearBattery;

public class NuclearBatteryCP{
    @SpirePatch(clz = NuclearBattery.class, method = SpirePatch.CONSTRUCTOR)
    public static class NuclearBatteryCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(NuclearBattery __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = NuclearBattery.class, method = "atPreBattle")
    public static class NuclearBatteryCP_2
    {
        @SpireInsertPatch(rloc = 0)
        public static void Insert(NuclearBattery __instance)
        {
            ++__instance.counter;
        }
    }
}

