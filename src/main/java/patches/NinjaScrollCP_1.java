package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.NinjaScroll;

@SpirePatch(clz = NinjaScroll.class, method = SpirePatch.CONSTRUCTOR)
public class NinjaScrollCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(NinjaScroll __instance)
    {
        __instance.counter = 0;
    }
}