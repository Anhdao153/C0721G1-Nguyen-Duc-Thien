package Hashmap_Linkedhashmap_Treemap.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ThucHanh1 {
    public static void main(String[] args) {
        //vị trí vào sao ra vậy
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Thien",21);
        hashMap.put("Andrea",23);
        hashMap.put("Thuy",23);
        System.out.println("Vị trí trong hashmap");
        System.out.println(hashMap);

       //từ khóa tăng dần theo ABC
        Map<String,Integer> treeMap=new TreeMap<>(hashMap);
        System.out.println("hiển thị theo vị trí tăng dần của từ khóa");
        System.out.println(treeMap);


        Map<String,Integer> linkedHashMap=new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }

}
