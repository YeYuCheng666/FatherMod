package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.SymbioticVirus;

@SpirePatch(clz = SymbioticVirus.class, method = SpirePatch.CONSTRUCTOR)
public class SymbioticVirusCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(SymbioticVirus __instance)
    {
        __instance.counter = 0;
    }
}