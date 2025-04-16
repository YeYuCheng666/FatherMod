package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MarkOfTheBloom;

public class MarkOfTheBloomCP{
    @SpirePatch(clz = MarkOfTheBloom.class, method = SpirePatch.CONSTRUCTOR)
    public static class MarkOfTheBloomCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(MarkOfTheBloom __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = MarkOfTheBloom.class, method = "onPlayerHeal", paramtypez = {int.class})
    public static class MarkOfTheBloomCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(MarkOfTheBloom __instance, int healAmount)
        {
            ++__instance.counter;
        }
    }
}

