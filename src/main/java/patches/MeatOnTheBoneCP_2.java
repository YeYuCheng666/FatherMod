package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MeatOnTheBone;

@SpirePatch(clz = MeatOnTheBone.class, method = "onTrigger")
public class MeatOnTheBoneCP_2
{
    @SpireInsertPatch(rloc = 3)
    public static void Insert(MeatOnTheBone __instance)
    {
        ++__instance.counter;
    }
}