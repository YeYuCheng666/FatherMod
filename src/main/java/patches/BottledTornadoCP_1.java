package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BottledTornado;

@SpirePatch(clz = BottledTornado.class, method = SpirePatch.CONSTRUCTOR)
public class BottledTornadoCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(BottledTornado __instance)
    {
        __instance.counter = 0;
    }
}