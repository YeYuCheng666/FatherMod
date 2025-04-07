package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.PreservedInsect;

@SpirePatch(clz = PreservedInsect.class, method = SpirePatch.CONSTRUCTOR)
public class PreservedInsectCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(PreservedInsect __instance)
    {
        __instance.counter = 0;
    }
}