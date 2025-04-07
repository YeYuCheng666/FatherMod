package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.utility.UseCardAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.relics.MummifiedHand;

@SpirePatch(clz = MummifiedHand.class, method = "onUseCard", paramtypez = {AbstractCard.class, UseCardAction.class})
public class MummifiedHandCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(MummifiedHand __instance, AbstractCard card, UseCardAction action)
    {
        ++__instance.counter;
    }
}