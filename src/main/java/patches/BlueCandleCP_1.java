package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BlueCandle;

@SpirePatch(clz = BlueCandle.class, method = SpirePatch.CONSTRUCTOR)
public class BlueCandleCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(BlueCandle __instance)
    {
        __instance.counter = 0;
    }
}