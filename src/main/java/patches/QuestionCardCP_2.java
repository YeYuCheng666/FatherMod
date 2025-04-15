package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.QuestionCard;

@SpirePatch(clz = QuestionCard.class, method = "changeNumberOfCardsInReward", paramtypez = {int.class})
public class QuestionCardCP_2
{
    @SpireInsertPatch(rloc = 0)
    public static void Insert(QuestionCard __instance, int numberOfCards)
    {
        ++__instance.counter;
    }
}