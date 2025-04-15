package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.CharonsAshes;

@SpirePatch(clz = CharonsAshes.class, method = SpirePatch.CONSTRUCTOR)
public class CharonsAshesCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(CharonsAshes __instance)
    {
        __instance.counter = 0;
    }
}