package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.relics.CharonsAshes;

@SpirePatch(clz = CharonsAshes.class, method = "onExhaust", paramtypez = {AbstractCard.class})
public class CharonsAshesCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(CharonsAshes __instance, AbstractCard card)
    {
        ++__instance.counter;
    }
}