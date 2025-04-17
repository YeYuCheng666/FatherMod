package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Toolbox;

public class ToolboxCP{
    @SpirePatch(clz = Toolbox.class, method = SpirePatch.CONSTRUCTOR)
    public static class ToolboxCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(Toolbox __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = Toolbox.class, method = "atBattleStartPreDraw")
    public static class ToolboxCP_2
    {
        @SpireInsertPatch(rloc = 0)
        public static void Insert(Toolbox __instance)
        {
            ++__instance.counter;
        }
    }
}

