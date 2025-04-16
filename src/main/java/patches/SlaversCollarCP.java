package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.SlaversCollar;

public class SlaversCollarCP{
    @SpirePatch(clz = SlaversCollar.class, method = SpirePatch.CONSTRUCTOR)
    public static class SlaversCollarCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(SlaversCollar __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = SlaversCollar.class, method = "beforeEnergyPrep")
    public static class SlaversCollarCP_2
    {
        @SpireInsertPatch(rloc = 10)
        public static void Insert(SlaversCollar __instance)
        {
            ++__instance.counter;
        }
    }
}

