package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.CloakClasp;

@SpirePatch(clz = CloakClasp.class, method = "onPlayerEndTurn")
public class CloakClaspCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(CloakClasp __instance)
    {
        ++__instance.counter;
    }
}