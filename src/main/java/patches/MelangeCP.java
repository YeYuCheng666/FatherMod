package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Melange;

public class MelangeCP{
    @SpirePatch(clz = Melange.class, method = SpirePatch.CONSTRUCTOR)
    public static class MelangeCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(Melange __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = Melange.class, method = "onShuffle")
    public static class MelangeCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(Melange __instance)
        {
            ++__instance.counter;
        }
    }
}

