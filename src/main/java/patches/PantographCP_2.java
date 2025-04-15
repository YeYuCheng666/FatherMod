package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Pantograph;

@SpirePatch(clz = Pantograph.class, method = "atBattleStart")
public class PantographCP_2
{
    @SpireInsertPatch(rloc = 3)
    public static void Insert(Pantograph __instance)
    {
        ++__instance.counter;
    }
}