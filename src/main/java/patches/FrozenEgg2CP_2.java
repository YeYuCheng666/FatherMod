package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.relics.FrozenEgg2;

@SpirePatch(clz = FrozenEgg2.class, method = "onObtainCard", paramtypez = {AbstractCard.class})
public class FrozenEgg2CP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(FrozenEgg2 __instance, AbstractCard card)
    {
        ++__instance.counter;
    }
}