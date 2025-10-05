package _02_Map.HashMap.Example;

import java.util.HashMap;
import java.util.Map;

public class _2_SubstitutionOfValue {
    public static void main(String[] args) {
        Map<String, String> capital = new HashMap<>();
        capital.put("BG", "Sofia");
        capital.put("UK", "London");

        //Актуализация на стойността на съществуващ ключ
        capital.put("BG","Plovdiv");
        String newCapital=capital.get("BG");
        System.out.println("Новата столица на BG е: "+newCapital);
    }
}
