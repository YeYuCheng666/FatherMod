package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.relics.ChampionsBelt;

@SpirePatch(clz = ChampionsBelt.class, method = "onTrigger", paramtypez = {AbstractCreature.class})
public class ChampionsBeltCP_2
{
    @SpireInsertPatch(rloc = 0)
    public static void Insert(ChampionsBelt __instance, AbstractCreature target)
    {
        ++__instance.counter;
    }
}