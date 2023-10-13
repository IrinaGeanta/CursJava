package curs11;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        // keys are unice, valorile pot fi duplicate
        map.put("T", "Tester");
        map.put("D", "Developer");
        map.put("M", "Manager");
        map.put("S", "Support");

        System.out.println(map);

        map.put("T", "Automation");
        System.out.println(map);

        System.out.println(map.get("T"));

        System.out.println("----------------------");
        System.out.println("contains key : " + map.containsKey("X"));
        System.out.println("contains value : " + map.containsValue("Manager"));

        System.out.println("----------------------");

        for(String key : map.keySet()){
            System.out.println(key);
        }

        System.out.println("----------------------");
        for(String value : map.values()){
            System.out.println(value);
        }

        // dc vrem sa stergem o anumita val/key sau key
        map.remove("T");
        System.out.println(map);

        map.replace("D","Director");
        System.out.println(map);
        map.put("S","Secretara");
        System.out.println(map);

        map.replace("T","Tester");
        //diferenta dintre replace si put, dc nu exista key atunci la put o pune la replace nu face nimic
    }
}
