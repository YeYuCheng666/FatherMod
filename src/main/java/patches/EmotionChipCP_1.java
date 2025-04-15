package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.EmotionChip;

@SpirePatch(clz = EmotionChip.class, method = SpirePatch.CONSTRUCTOR)
public class EmotionChipCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(EmotionChip __instance)
    {
        __instance.counter = 0;
    }
}