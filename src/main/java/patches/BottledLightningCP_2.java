package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BottledLightning;

@SpirePatch(clz = BottledLightning.class, method = "atBattleStart")
public class BottledLightningCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(BottledLightning __instance)
    {
        ++__instance.counter;
    }
}