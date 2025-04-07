package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.ToyOrnithopter;

@SpirePatch(clz = ToyOrnithopter.class, method = "onUsePotion")
public class ToyOrnithopterCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(ToyOrnithopter __instance)
    {
        ++__instance.counter;
    }
}