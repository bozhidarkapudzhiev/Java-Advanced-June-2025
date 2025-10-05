package _02_Map.HashMap.Example;

import java.util.HashMap;
import java.util.Map;

public class _4_DeletingAnItem {
    public static void main(String[] args) {
        Map<Integer,String>studentIds=new HashMap<>();
        studentIds.put(101,"Anna");
        studentIds.put(102,"Boris");

        //Премахване по ключ
        studentIds.remove(101);
        System.out.println("След премахване на 101: " + String.valueOf(studentIds)
                .replaceAll("\\{","")
                .replaceAll("\\}",""));
    }
}
