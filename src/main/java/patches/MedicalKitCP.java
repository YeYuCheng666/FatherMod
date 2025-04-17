package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.utility.UseCardAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.relics.MedicalKit;

public class MedicalKitCP{
    @SpirePatch(clz = MedicalKit.class, method = SpirePatch.CONSTRUCTOR)
    public static class MedicalKitCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(MedicalKit __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = MedicalKit.class, method = "onUseCard", paramtypez = {AbstractCard.class, UseCardAction.class})
    public static class MedicalKitCP_2
    {
        @SpireInsertPatch(rloc = 2)
        public static void Insert(MedicalKit __instance, AbstractCard card, UseCardAction action)
        {
            ++__instance.counter;
        }
    }
}

