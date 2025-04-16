package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.utility.UseCardAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.relics.Necronomicon;

public class NecronomiconCP{
    @SpirePatch(clz = Necronomicon.class, method = SpirePatch.CONSTRUCTOR)
    public static class NecronomiconCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(Necronomicon __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = Necronomicon.class, method = "onUseCard", paramtypez = {AbstractCard.class, UseCardAction.class})
    public static class NecronomiconCP_2
    {
        @SpireInsertPatch(rloc = 4)
        public static void Insert(Necronomicon __instance, AbstractCard card, UseCardAction action)
        {
            ++__instance.counter;
        }
    }
}

