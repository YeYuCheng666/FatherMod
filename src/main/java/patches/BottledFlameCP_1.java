package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BottledFlame;

@SpirePatch(clz = BottledFlame.class, method = SpirePatch.CONSTRUCTOR)
public class BottledFlameCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(BottledFlame __instance)
    {
        __instance.counter = 0;
    }
}