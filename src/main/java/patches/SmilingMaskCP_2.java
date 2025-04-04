package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.SmilingMask;
import com.megacrit.cardcrawl.rooms.AbstractRoom;

@SpirePatch(clz = SmilingMask.class, method = "onEnterRoom", paramtypez = {AbstractRoom.class})
public class SmilingMaskCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(SmilingMask __instance, AbstractRoom room)
    {
        ++__instance.counter;
    }
}