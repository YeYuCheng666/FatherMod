package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Courier;

@SpirePatch(clz = Courier.class, method = SpirePatch.CONSTRUCTOR)
public class CourierCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(Courier __instance)
    {
        __instance.counter = 0;
    }
}