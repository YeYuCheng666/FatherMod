package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.TheSpecimen;

@SpirePatch(clz = TheSpecimen.class, method = SpirePatch.CONSTRUCTOR)
public class TheSpecimenCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(TheSpecimen __instance)
    {
        __instance.counter = 0;
    }
}