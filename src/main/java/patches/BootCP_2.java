package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.DamageInfo;
import com.megacrit.cardcrawl.relics.Boot;

@SpirePatch(clz = Boot.class, method = "onAttackToChangeDamage", paramtypez = {DamageInfo.class, int.class})
public class BootCP_2
{
    @SpireInsertPatch(rloc = 3)
    public static void Insert(Boot __instance, DamageInfo info, int damage)
    {
        ++__instance.counter;
    }
}