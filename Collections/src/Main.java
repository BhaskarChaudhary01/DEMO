import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        List<String> ar=new ArrayList<>();


        ar.add("Apple");
        ar.add("Banana");
        ar.add("Orange");
        ar.add("Mango");
        System.out.println(ar);
        Set<String> set=new HashSet<>(ar);
        System.out.println("list converted into set "+set);
        Map<Integer,String> map=new HashMap<>();
        for (int i = 0; i < ar.size(); i++) {
            map.put(i, ar.get(i));
        }

        // Display the Map
        System.out.println("Map (using indices as keys): " + map);
    }
}