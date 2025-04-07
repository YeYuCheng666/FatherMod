package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.relics.MoltenEgg2;

@SpirePatch(clz = MoltenEgg2.class, method = "onObtainCard", paramtypez = {AbstractCard.class})
public class MoltenEgg2CP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(MoltenEgg2 __instance, AbstractCard card)
    {
        ++__instance.counter;
    }
}