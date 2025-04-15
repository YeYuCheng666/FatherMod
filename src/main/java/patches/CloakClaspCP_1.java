package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.CloakClasp;

@SpirePatch(clz = CloakClasp.class, method = SpirePatch.CONSTRUCTOR)
public class CloakClaspCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(CloakClasp __instance)
    {
        __instance.counter = 0;
    }
}