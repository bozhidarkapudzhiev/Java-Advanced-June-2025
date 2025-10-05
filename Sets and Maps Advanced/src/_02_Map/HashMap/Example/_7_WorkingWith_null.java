package _02_Map.HashMap.Example;

import java.util.HashMap;
import java.util.Map;

public class _7_WorkingWith_null {
    public static void main(String[] args) {
        Map<String,String> example=new HashMap<>();
        example.put(null,"Null Key Value");//Позволява TODO един  null ключ
        example.put("Key1",null);//Позволява todo null стойности
        System.out.println("Стойност на Null Key: "+example.get(null));
        System.out.println("Стойност на Key1: "+example.get("Key1"));
    }
}
