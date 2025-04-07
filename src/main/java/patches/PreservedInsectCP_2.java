package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.PreservedInsect;

@SpirePatch(clz = PreservedInsect.class, method = "atBattleStart")
public class PreservedInsectCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(PreservedInsect __instance)
    {
        ++__instance.counter;
    }
}