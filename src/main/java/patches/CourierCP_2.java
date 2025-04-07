package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Courier;
import com.megacrit.cardcrawl.rooms.AbstractRoom;

@SpirePatch(clz = Courier.class, method = "onEnterRoom", paramtypez = {AbstractRoom.class})
public class CourierCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(Courier __instance, AbstractRoom room)
    {
        ++__instance.counter;
    }
}