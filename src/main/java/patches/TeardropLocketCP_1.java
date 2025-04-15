package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.TeardropLocket;

@SpirePatch(clz = TeardropLocket.class, method = SpirePatch.CONSTRUCTOR)
public class TeardropLocketCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(TeardropLocket __instance)
    {
        __instance.counter = 0;
    }
}