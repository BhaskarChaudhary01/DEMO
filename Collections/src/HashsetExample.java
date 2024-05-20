import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashsetExample {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        Set<String> set=new HashSet<>();
        for(int i=0;i<5;i++)
        {
            String str=sc.nextLine();
            set.add(str);
        }
        for(String st :set)
        {
            System.out.println(st);
        }
        System.out.println(set.contains("BHASKAR"));
        System.out.println(set.hashCode());
        System.out.println(set.size());
        set.remove("BHASKAR");
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.iterator());
    }
}
