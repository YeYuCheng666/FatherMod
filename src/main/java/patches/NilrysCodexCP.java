package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.NilrysCodex;

public class NilrysCodexCP{
    @SpirePatch(clz = NilrysCodex.class, method = SpirePatch.CONSTRUCTOR)
    public static class NilrysCodexCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(NilrysCodex __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = NilrysCodex.class, method = "onPlayerEndTurn")
    public static class NilrysCodexCP_2
    {
        @SpireInsertPatch(rloc = 0)
        public static void Insert(NilrysCodex __instance)
        {
            ++__instance.counter;
        }
    }
}

