package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MawBank;

@SpirePatch(clz = MawBank.class, method = SpirePatch.CONSTRUCTOR)
public class MawBankCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(MawBank __instance)
    {
        __instance.counter = 0;
    }
}