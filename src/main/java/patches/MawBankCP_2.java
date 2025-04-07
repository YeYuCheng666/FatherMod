package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MawBank;
import com.megacrit.cardcrawl.rooms.AbstractRoom;

@SpirePatch(clz = MawBank.class, method = "onEnterRoom", paramtypez = {AbstractRoom.class})
public class MawBankCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(MawBank __instance, AbstractRoom room)
    {
        ++__instance.counter;
    }
}