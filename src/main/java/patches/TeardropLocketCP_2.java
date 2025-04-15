package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.TeardropLocket;

@SpirePatch(clz = TeardropLocket.class, method = "atBattleStart")
public class TeardropLocketCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(TeardropLocket __instance)
    {
        ++__instance.counter;
    }
}