package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MealTicket;
import com.megacrit.cardcrawl.rooms.AbstractRoom;

@SpirePatch(clz = MealTicket.class, method = "justEnteredRoom", paramtypez = {AbstractRoom.class})
public class MealTicketCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(MealTicket __instance, AbstractRoom room)
    {
        ++__instance.counter;
    }
}