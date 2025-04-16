package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.FaceOfCleric;

public class FaceOfClericCP{
    @SpirePatch(clz = FaceOfCleric.class, method = SpirePatch.CONSTRUCTOR)
    public static class FaceOfClericCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(FaceOfCleric __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = FaceOfCleric.class, method = "onVictory")
    public static class FaceOfClericCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(FaceOfCleric __instance)
        {
            ++__instance.counter;
        }
    }
}

