package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.RedMask;

public class RedMaskCP{
    @SpirePatch(clz = RedMask.class, method = SpirePatch.CONSTRUCTOR)
    public static class RedMaskCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(RedMask __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = RedMask.class, method = "atBattleStart")
    public static class RedMaskCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(RedMask __instance)
        {
            ++__instance.counter;
        }
    }
}

