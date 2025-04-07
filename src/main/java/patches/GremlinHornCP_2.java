package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import com.megacrit.cardcrawl.relics.GremlinHorn;

@SpirePatch(clz = GremlinHorn.class, method = "onMonsterDeath", paramtypez = {AbstractMonster.class})
public class GremlinHornCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(GremlinHorn __instance, AbstractMonster monster)
    {
        ++__instance.counter;
    }
}