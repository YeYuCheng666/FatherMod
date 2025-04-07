package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.ArtOfWar;

@SpirePatch(clz = ArtOfWar.class, method = "atTurnStart")
public class ArtOfWarCP_2
{
    @SpireInsertPatch(rloc = 4)
    public static void Insert(ArtOfWar __instance)
    {
        ++__instance.counter;
    }
}