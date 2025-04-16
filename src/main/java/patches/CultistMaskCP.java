package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.CultistMask;

public class CultistMaskCP{
    @SpirePatch(clz = CultistMask.class, method = SpirePatch.CONSTRUCTOR)
    public static class CultistMaskCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(CultistMask __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = CultistMask.class, method = "atBattleStart")
    public static class CultistMaskCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(CultistMask __instance)
        {
            ++__instance.counter;
        }
    }
}

