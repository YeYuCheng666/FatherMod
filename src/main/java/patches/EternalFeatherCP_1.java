package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.EternalFeather;

@SpirePatch(clz = EternalFeather.class, method = SpirePatch.CONSTRUCTOR)
public class EternalFeatherCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(EternalFeather __instance)
    {
        __instance.counter = 0;
    }
}