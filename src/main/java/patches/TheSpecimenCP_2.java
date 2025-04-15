package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import com.megacrit.cardcrawl.relics.TheSpecimen;

@SpirePatch(clz = TheSpecimen.class, method = "onMonsterDeath", paramtypez = {AbstractMonster.class})
public class TheSpecimenCP_2
{
    @SpireInsertPatch(rloc = 6)
    public static void Insert(TheSpecimen __instance, AbstractMonster monster)
    {
        ++__instance.counter;
    }
}