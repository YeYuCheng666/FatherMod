package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MagicFlower;

@SpirePatch(clz = MagicFlower.class, method = SpirePatch.CONSTRUCTOR)
public class MagicFlowerCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(MagicFlower __instance)
    {
        __instance.counter = 0;
    }
}