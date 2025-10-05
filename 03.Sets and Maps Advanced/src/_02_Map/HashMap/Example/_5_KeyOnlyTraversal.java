package _02_Map.HashMap.Example;

import java.util.HashMap;
import java.util.Map;

public class _5_KeyOnlyTraversal {
    public static void main(String[] args) {
        Map<String,String>config=new HashMap<>();
        config.put("PORT","8080");
        config.put("HOST","localhost");
        for (String key: config.keySet()){
            System.out.println("Настройка: " + key);
        }
    }
}