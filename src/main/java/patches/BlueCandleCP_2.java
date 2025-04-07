package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.utility.UseCardAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.relics.BlueCandle;

@SpirePatch(clz = BlueCandle.class, method = "onUseCard", paramtypez = {AbstractCard.class, UseCardAction.class})
public class BlueCandleCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(BlueCandle __instance, AbstractCard card, UseCardAction action)
    {
        ++__instance.counter;
    }
}