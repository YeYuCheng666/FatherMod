package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Anchor;

@SpirePatch(clz = Anchor.class, method = "atBattleStart")
public class AnchorCP_2
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(Anchor __instance)
    {
        ++__instance.counter;
    }
}