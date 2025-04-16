package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.RunicCube;

public class RunicCubeCP{
    @SpirePatch(clz = RunicCube.class, method = SpirePatch.CONSTRUCTOR)
    public static class RunicCubeCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(RunicCube __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = RunicCube.class, method = "wasHPLost", paramtypez = {int.class})
    public static class RunicCubeCP_2
    {
        @SpireInsertPatch(rloc = 3)
        public static void Insert(RunicCube __instance, int damage)
        {
            ++__instance.counter;
        }
    }
}

