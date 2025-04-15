package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Pantograph;

@SpirePatch(clz = Pantograph.class, method = SpirePatch.CONSTRUCTOR)
public class PantographCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(Pantograph __instance)
    {
        __instance.counter = 0;
    }
}