package _02_Map.HashMap.Example;

import java.util.HashMap;
import java.util.Map;

public class _3_KeyAndStonyCheck {
    public static void main(String[] args) {
        Map<String,String>users=new HashMap<>();
        users.put("ivan","pass123");

        //Проверка за ключ
        boolean keyExists= users.containsKey("ivan");
        System.out.println("има ли ключ 'ivan'? "+keyExists);

        //Проверка за стойност
        boolean valueExists=users.containsValue("pass123");
        System.out.println("Има ли стойност 'pass123'? "+valueExists);
    }
}
