package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.TungstenRod;

@SpirePatch(clz = TungstenRod.class, method = "onLoseHpLast", paramtypez = {int.class})
public class TungstenRodCP_2
{
    @SpireInsertPatch(rloc = 2)
    public static void Insert(TungstenRod __instance, int damage)
    {
        ++__instance.counter;
    }
}

//java -jar D:\SteamLibrary\steamapps\workshop\content\646570\1605060445\ModTheSpire.jar --out-jar