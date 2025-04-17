package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.utility.UseCardAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.relics.OrangePellets;

public class OrangePelletsCP{
    @SpirePatch(clz = OrangePellets.class, method = SpirePatch.CONSTRUCTOR)
    public static class OrangePelletsCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(OrangePellets __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = OrangePellets.class, method = "onUseCard", paramtypez = {AbstractCard.class, UseCardAction.class})
    public static class OrangePelletsCP_2
    {
        @SpireInsertPatch(rloc = 10)
        public static void Insert(OrangePellets __instance, AbstractCard card, UseCardAction action)
        {
            ++__instance.counter;
        }
    }
}

