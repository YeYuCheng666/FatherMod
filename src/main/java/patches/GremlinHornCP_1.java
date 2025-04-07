package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.GremlinHorn;

@SpirePatch(clz = GremlinHorn.class, method = SpirePatch.CONSTRUCTOR)
public class GremlinHornCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(GremlinHorn __instance)
    {
        __instance.counter = 0;
    }
}