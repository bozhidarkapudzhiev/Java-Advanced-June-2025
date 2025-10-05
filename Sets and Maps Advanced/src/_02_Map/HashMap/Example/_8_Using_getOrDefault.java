package _02_Map.HashMap.Example;

import java.util.HashMap;
import java.util.Map;

public class _8_Using_getOrDefault {
    public static void main(String[] args) {
        Map<String,Integer> counts=new HashMap<>();
        counts.put("A",10);
        //Връщане 10, защото "A" съществува
        int countA=counts.getOrDefault("A",0);
        System.out.println("Брой А: "+countA);


        //Връща 0 (стойност по подразбиране ) ,защото "B" не съществува
        int countB=counts.getOrDefault("B",0);
        System.out.println("Брой B: "+countB);
    }
}
