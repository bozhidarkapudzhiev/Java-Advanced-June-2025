package _02_Map.HashMap.Example;

import java.util.HashMap;
import java.util.Map;

public class _10_ALookAtTheEmptyMap {
    public static void main(String[] args) {
        Map<String,String>emptyMаp=new HashMap<>();
        System.out.println("Празен ли е Map-а? "+emptyMаp.isEmpty());
        emptyMаp.put("а","1");
        System.out.println("Празен ли е Map-а? "+emptyMаp.isEmpty());
    }
}
