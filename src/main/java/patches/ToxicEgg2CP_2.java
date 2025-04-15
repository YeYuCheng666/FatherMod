package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.relics.ToxicEgg2;

@SpirePatch(clz = ToxicEgg2.class, method = "onObtainCard", paramtypez = {AbstractCard.class})
public class ToxicEgg2CP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(ToxicEgg2 __instance, AbstractCard card)
    {
        ++__instance.counter;
    }
}