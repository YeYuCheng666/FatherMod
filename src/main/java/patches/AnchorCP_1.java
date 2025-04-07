package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Anchor;

@SpirePatch(clz = Anchor.class, method = SpirePatch.CONSTRUCTOR)
public class AnchorCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(Anchor __instance)
    {
        __instance.counter = 0;
    }
}