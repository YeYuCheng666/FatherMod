package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.relics.DarkstonePeriapt;

@SpirePatch(clz = DarkstonePeriapt.class, method = "onObtainCard", paramtypez = {AbstractCard.class})
public class DarkstonePeriaptCP_2
{
    @SpireInsertPatch(rloc = 5)
    public static void Insert(DarkstonePeriapt __instance, AbstractCard card)
    {
        ++__instance.counter;
    }
}