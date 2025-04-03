package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Boot;

@SpirePatch(clz = Boot.class, method = SpirePatch.CONSTRUCTOR)
public class BootCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(Boot __instance)
    {
        __instance.counter = 0;
    }
}