package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.HolyWater;

public class HolyWaterCP{
    @SpirePatch(clz = HolyWater.class, method = SpirePatch.CONSTRUCTOR)
    public static class HolyWaterCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(HolyWater __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = HolyWater.class, method = "atBattleStartPreDraw")
    public static class HolyWaterCP_2
    {
        @SpireInsertPatch(rloc = 0)
        public static void Insert(HolyWater __instance)
        {
            ++__instance.counter;
        }
    }
}

