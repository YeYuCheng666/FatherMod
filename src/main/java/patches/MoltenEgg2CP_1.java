package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MoltenEgg2;

@SpirePatch(clz = MoltenEgg2.class, method = SpirePatch.CONSTRUCTOR)
public class MoltenEgg2CP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(MoltenEgg2 __instance)
    {
        __instance.counter = 0;
    }
}