package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.relics.CeramicFish;

@SpirePatch(clz = CeramicFish.class, method = "onObtainCard", paramtypez = {AbstractCard.class})
public class CeramicFishCP_2
{
    @SpireInsertPatch(rloc = 0)
    public static void Insert(CeramicFish __instance, AbstractCard card)
    {
        ++__instance.counter;
    }
}