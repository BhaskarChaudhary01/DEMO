import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;

public class MapExample {
    public static void main(String[]args)
    {
        Map<String,Integer> map=new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Mango", 40);
        System.out.println("Map: " + map);
        map.remove("Apple");
        System.out.println("afetr removing apple=> "+map);
        System.out.println(map.containsKey("Banana"));
        System.out.println(map.containsValue(30));
        System.out.println(map.size());
        System.out.println("Iterating through the map entries:");
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Set<String> keys = map.keySet();
        System.out.println("Keys: " + keys);
        // Get the values of the map
        Collection<Integer> values = map.values();
        System.out.println("Values: " + values);

        // Clear the map
        map.clear();
        System.out.println("After clearing, map: " + map);
    }
}
