package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.DeadBranch;

@SpirePatch(clz = DeadBranch.class, method = SpirePatch.CONSTRUCTOR)
public class DeadBranchCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(DeadBranch __instance)
    {
        __instance.counter = 0;
    }
}