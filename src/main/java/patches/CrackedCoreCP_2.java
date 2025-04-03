package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.CrackedCore;

@SpirePatch(clz = CrackedCore.class, method = "atPreBattle")
public class CrackedCoreCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(CrackedCore __instance)
    {
        ++__instance.counter;
    }
}