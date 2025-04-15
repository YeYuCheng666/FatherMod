package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.NinjaScroll;

@SpirePatch(clz = NinjaScroll.class, method = "atBattleStartPreDraw")
public class NinjaScrollCP_2
{
    @SpireInsertPatch(rloc = 0)
    public static void Insert(NinjaScroll __instance)
    {
        ++__instance.counter;
    }
}