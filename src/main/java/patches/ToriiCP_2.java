package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.DamageInfo;
import com.megacrit.cardcrawl.relics.Torii;

@SpirePatch(clz = Torii.class, method = "onAttacked", paramtypez = {DamageInfo.class, int.class})
public class ToriiCP_2
{
    @SpireInsertPatch(rloc = 3)
    public static void Insert(Torii __instance, DamageInfo info, int damage)
    {
        ++__instance.counter;
    }
}