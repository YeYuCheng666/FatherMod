package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BottledTornado;

@SpirePatch(clz = BottledTornado.class, method = "atBattleStart")
public class BottledTornadoCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(BottledTornado __instance)
    {
        ++__instance.counter;
    }
}