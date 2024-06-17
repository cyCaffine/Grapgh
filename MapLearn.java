import java.util.HashMap;
import java.util.Map;

public class MapLearn {


    static void HashMapMethod(){

        // syntax
        Map<String, Integer> map = new HashMap<>();

        // adding elment
        map.put("menka",23);
        map.put("Hello",5);
        map.put("DSA",10);
        map.put("PROHECTS",3);
        map.put("ANDROID",10);
        
        // get element
        System.out.println(map.get("DSA")); //10
        System.out.println(map.get("rahul"));//null
        
        // updating the value of key in hashmap
        map.put("DSA", 20); //20
        System.out.println(map.get("DSA"));

        // remove pair 
        
        System.out.println(map.remove("DSA")); //20
        System.out.println(map.remove("riya")); //null

        // check if the key is exits in the hashmap or not
        System.out.println(map.containsKey("DSA"));
        System.out.println(map.containsKey("menka"));

        // adding new entry  only if new key doesn't exit already
        if(map.containsKey("menka")){
         System.out.println( map.put("menka", 10000));
        }
        map.putIfAbsent("Yaskija",100);
        map.putIfAbsent("DSA", 123);

        // GET ALL KEY
         System.out.println(map.keySet());

        // GET  ALL VALUE

        System.out.println(map.values());

        // GET ALL ENTITIES
        System.out.println(map.entrySet());

        // TRAVERSING ALL ELMENT
        // 1st method
        for(String key : map.keySet()){
            System.out.print(map.get(key));
        }

        System.out.println();
        // 2nd methd
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.printf(e.getKey(), e.getValue());
        }

        System.out.println();
        for(var e : map.entrySet()){
            System.out.printf(e.getKey(), e.getValue());
        }



        

    }
    public static void main(String[] args) {
        HashMapMethod();
    }
    
}
