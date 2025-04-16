package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.VioletLotus;
import com.megacrit.cardcrawl.stances.AbstractStance;

public class VioletLotusCP{
    @SpirePatch(clz = VioletLotus.class, method = SpirePatch.CONSTRUCTOR)
    public static class VioletLotusCP_1
    {
        @SpireInsertPatch(rloc = 1)
        public static void Insert(VioletLotus __instance)
        {
            __instance.counter = 0;
        }
    }

    @SpirePatch(clz = VioletLotus.class, method = "onChangeStance", paramtypez = {AbstractStance.class, AbstractStance.class})
    public static class VioletLotusCP_2
    {
        @SpireInsertPatch(rloc = 2)
        public static void Insert(VioletLotus __instance, AbstractStance prevStance, AbstractStance newStance)
        {
            ++__instance.counter;
        }
    }
}

