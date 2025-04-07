package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MealTicket;

@SpirePatch(clz = MealTicket.class, method = SpirePatch.CONSTRUCTOR)
public class MealTicketCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(MealTicket __instance)
    {
        __instance.counter = 0;
    }
}