package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MeatOnTheBone;

@SpirePatch(clz = MeatOnTheBone.class, method = SpirePatch.CONSTRUCTOR)
public class MeatOnTheBoneCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(MeatOnTheBone __instance)
    {
        __instance.counter = 0;
    }
}