package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BottledLightning;

@SpirePatch(clz = BottledLightning.class, method = SpirePatch.CONSTRUCTOR)
public class BottledLightningCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(BottledLightning __instance)
    {
        __instance.counter = 0;
    }
}