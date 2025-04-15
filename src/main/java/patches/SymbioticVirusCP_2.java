package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.SymbioticVirus;

@SpirePatch(clz = SymbioticVirus.class, method = "atPreBattle")
public class SymbioticVirusCP_2
{
    @SpireInsertPatch(rloc = 0)
    public static void Insert(SymbioticVirus __instance)
    {
        ++__instance.counter;
    }
}