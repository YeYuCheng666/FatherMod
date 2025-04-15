package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.relics.DeadBranch;

@SpirePatch(clz = DeadBranch.class, method = "onExhaust", paramtypez = {AbstractCard.class})
public class DeadBranchCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(DeadBranch __instance, AbstractCard card)
    {
        ++__instance.counter;
    }
}