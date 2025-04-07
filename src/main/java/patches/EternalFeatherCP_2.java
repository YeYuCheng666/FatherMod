package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.EternalFeather;
import com.megacrit.cardcrawl.rooms.AbstractRoom;

@SpirePatch(clz = EternalFeather.class, method = "onEnterRoom", paramtypez = {AbstractRoom.class})
public class EternalFeatherCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(EternalFeather __instance, AbstractRoom damage)
    {
        ++__instance.counter;
    }
}