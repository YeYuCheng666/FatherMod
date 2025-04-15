package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.ThreadAndNeedle;

@SpirePatch(clz = ThreadAndNeedle.class, method = "atBattleStart")
public class ThreadAndNeedleCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(ThreadAndNeedle __instance)
    {
        ++__instance.counter;
    }
}