package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.EmotionChip;

@SpirePatch(clz = EmotionChip.class, method = "atTurnStart")
public class EmotionChipCP_2
{
    @SpireInsertPatch(rloc = 3)
    public static void Insert(EmotionChip __instance)
    {
        ++__instance.counter;
    }
}