package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Orichalcum;

@SpirePatch(clz = Orichalcum.class, method = SpirePatch.CONSTRUCTOR)
public class OrichalcumCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(Orichalcum __instance)
    {
        __instance.counter = 0;
    }
}