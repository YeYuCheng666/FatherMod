package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MagicFlower;

@SpirePatch(clz = MagicFlower.class, method = "onPlayerHeal", paramtypez = {int.class})
public class MagicFlowerCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(MagicFlower __instance, int damage)
    {
        ++__instance.counter;
    }
}