package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Akabeko;

@SpirePatch(clz = Akabeko.class, method = SpirePatch.CONSTRUCTOR)
public class AkabekoCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(Akabeko __instance)
    {
        __instance.counter = 0;
    }
}