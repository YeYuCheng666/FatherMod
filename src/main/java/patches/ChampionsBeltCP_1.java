package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.ChampionsBelt;

@SpirePatch(clz = ChampionsBelt.class, method = SpirePatch.CONSTRUCTOR)
public class ChampionsBeltCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(ChampionsBelt __instance)
    {
        __instance.counter = 0;
    }
}