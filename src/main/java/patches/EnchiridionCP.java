package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Enchiridion;

public class EnchiridionCP{
    @SpirePatch(clz = Enchiridion.class, method = SpirePatch.CONSTRUCTOR)
    public static class EnchiridionCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(Enchiridion __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = Enchiridion.class, method = "atPreBattle")
    public static class EnchiridionCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(Enchiridion __instance)
        {
            ++__instance.counter;
        }
    }
}

