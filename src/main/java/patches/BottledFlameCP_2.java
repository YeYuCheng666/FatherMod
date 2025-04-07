package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BottledFlame;

@SpirePatch(clz = BottledFlame.class, method = "atBattleStart")
public class BottledFlameCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(BottledFlame __instance)
    {
        ++__instance.counter;
    }
}