package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.WarpedTongs;

public class WarpedTongsCP{
    @SpirePatch(clz = WarpedTongs.class, method = SpirePatch.CONSTRUCTOR)
    public static class WarpedTongsCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(WarpedTongs __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = WarpedTongs.class, method = "atTurnStartPostDraw")
    public static class WarpedTongsCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(WarpedTongs __instance)
        {
            ++__instance.counter;
        }
    }
}

