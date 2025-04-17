package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MembershipCard;
import com.megacrit.cardcrawl.rooms.AbstractRoom;

public class MembershipCardCP{
    @SpirePatch(clz = MembershipCard.class, method = SpirePatch.CONSTRUCTOR)
    public static class MembershipCardCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(MembershipCard __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = MembershipCard.class, method = "onEnterRoom", paramtypez = {AbstractRoom.class})
    public static class MembershipCardCP_2
    {
        @SpireInsertPatch(rloc = 2)
        public static void Insert(MembershipCard __instance, AbstractRoom room)
        {
            ++__instance.counter;
        }
    }
}

