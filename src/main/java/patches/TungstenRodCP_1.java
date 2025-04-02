package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.TungstenRod;

@SpirePatch(clz = TungstenRod.class, method = SpirePatch.CONSTRUCTOR)
public class TungstenRodCP_1
{
    @SpireInsertPatch(rloc = 1)
    public static void Insert(TungstenRod __instance)
    {
        __instance.counter = 0;
    }
}

//java -jar D:\SteamLibrary\steamapps\workshop\content\646570\1605060445\ModTheSpire.jar --out-jar