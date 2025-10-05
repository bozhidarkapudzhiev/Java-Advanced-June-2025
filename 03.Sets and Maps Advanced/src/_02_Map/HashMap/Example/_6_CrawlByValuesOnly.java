package _02_Map.HashMap.Example;

import java.util.HashMap;
import java.util.Map;

public class _6_CrawlByValuesOnly {
    public static void main(String[] args) {
        Map<String,String>config=new HashMap<>();
        config.put("PORT","8080");
        config.put("HOST","localhost");
        for (String value: config.values()){
            System.out.println("Стойност: "+value);
        }
    }
}
