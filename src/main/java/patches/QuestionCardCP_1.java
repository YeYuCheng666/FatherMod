package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.QuestionCard;

@SpirePatch(clz = QuestionCard.class, method = SpirePatch.CONSTRUCTOR)
public class QuestionCardCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(QuestionCard __instance)
    {
        __instance.counter = 0;
    }
}