package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.relics.HandDrill;

public class HandDrillCP{
    @SpirePatch(clz = HandDrill.class, method = SpirePatch.CONSTRUCTOR)
    public static class HandDrillCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(HandDrill __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = HandDrill.class, method = "onBlockBroken", paramtypez = {AbstractCreature.class})
    public static class HandDrillCP_2
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(HandDrill __instance, AbstractCreature m)
        {
            ++__instance.counter;
        }
    }
}

