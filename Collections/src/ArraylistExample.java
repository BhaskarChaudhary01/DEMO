import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    public static void main(String []ry)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> ar=new ArrayList<>();

        for(int i=0;i<5;i++)
        {
            int j=sc.nextInt();
            ar.add(j);
        }
        for(int a :ar)
        {
            System.out.print(a+",");
        }
        System.out.println(ar.size());
        //remove the element from the arraylist
        ar.remove(3);
        System.out.println("after removing element at index 3 =>"+ar);
        ar.set(2,0);
        ar.add(3,8);
        System.out.println("after changing element at index 2=0= and 3=8  > "+ar);
        System.out.println(ar.contains(0));
        ar.clear();
        System.out.println("after clearing the arraylist "+ar);
        System.out.println(ar.isEmpty());
    }
}
