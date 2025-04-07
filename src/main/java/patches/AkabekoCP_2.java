package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Akabeko;

@SpirePatch(clz = Akabeko.class, method = "atBattleStart")
public class AkabekoCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(Akabeko __instance)
    {
        ++__instance.counter;
    }
}