package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.SsserpentHead;
import com.megacrit.cardcrawl.rooms.AbstractRoom;

public class SsserpentHeadCP{
    @SpirePatch(clz = SsserpentHead.class, method = SpirePatch.CONSTRUCTOR)
    public static class SsserpentHeadCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(SsserpentHead __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = SsserpentHead.class, method = "onEnterRoom", paramtypez = {AbstractRoom.class})
    public static class SsserpentHeadCP_2
    {
        @SpireInsertPatch(rloc = 2)
        public static void Insert(SsserpentHead __instance, AbstractRoom room)
        {
            ++__instance.counter;
        }
    }
}

