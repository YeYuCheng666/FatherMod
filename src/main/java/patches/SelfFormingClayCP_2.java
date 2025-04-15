package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.SelfFormingClay;

@SpirePatch(clz = SelfFormingClay.class, method = "wasHPLost", paramtypez = {int.class})
public class SelfFormingClayCP_2
{
    @SpireInsertPatch(rloc = 3)
    public static void Insert(SelfFormingClay __instance, int damage)
    {
        ++__instance.counter;
    }
}