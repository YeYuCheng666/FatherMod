package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Orichalcum;

@SpirePatch(clz = Orichalcum.class, method = "onPlayerEndTurn")
public class OrichalcumCP_2
{
    @SpireInsertPatch(rloc = 3)
    public static void Insert(Orichalcum __instance)
    {
        ++__instance.counter;
    }
}