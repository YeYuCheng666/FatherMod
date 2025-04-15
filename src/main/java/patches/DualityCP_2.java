package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.utility.UseCardAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.relics.Duality;

@SpirePatch(clz = Duality.class, method = "onUseCard", paramtypez = {AbstractCard.class, UseCardAction.class})
public class DualityCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(Duality __instance, AbstractCard card, UseCardAction action)
    {
        ++__instance.counter;
    }
}