package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BloodyIdol;

public class BloodyIdolCP{
    @SpirePatch(clz = BloodyIdol.class, method = SpirePatch.CONSTRUCTOR)
    public static class BloodyIdolCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(BloodyIdol __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = BloodyIdol.class, method = "onGainGold")
    public static class BloodyIdolCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(BloodyIdol __instance)
        {
            ++__instance.counter;
        }
    }
}

