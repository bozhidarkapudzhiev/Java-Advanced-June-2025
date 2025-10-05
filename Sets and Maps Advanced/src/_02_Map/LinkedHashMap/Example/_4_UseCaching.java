package _02_Map.LinkedHashMap.Example;

import java.util.LinkedHashMap;
import java.util.Map;

public class _4_UseCaching {
    public static void main(String[] args) {
        Map<String,String>lruCaching=new LinkedHashMap<>(16,0.75f,true);
        lruCaching.put("A","1");
        lruCaching.put("B","2");
        lruCaching.get("A");//Достъп до "A" го мести в края на реда

        //Обхождане : "B" е на първо място,"A"  е последно (защоо е последно достъпен)
        for (String key : lruCaching.keySet()){
            System.out.println(key);
        }
    }
}
