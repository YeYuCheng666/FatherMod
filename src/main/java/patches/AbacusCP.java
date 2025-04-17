package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Abacus;

public class AbacusCP{
    @SpirePatch(clz = Abacus.class, method = SpirePatch.CONSTRUCTOR)
    public static class AbacusCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(Abacus __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = Abacus.class, method = "onShuffle")
    public static class AbacusCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(Abacus __instance)
        {
            ++__instance.counter;
        }
    }
}

