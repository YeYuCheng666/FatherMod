package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.DarkstonePeriapt;

@SpirePatch(clz = DarkstonePeriapt.class, method = SpirePatch.CONSTRUCTOR)
public class DarkstonePeriaptCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(DarkstonePeriapt __instance)
    {
        __instance.counter = 0;
    }
}