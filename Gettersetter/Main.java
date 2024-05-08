import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Empolye emp = new Empolye();
        System.out.println("Enter Name ");
        String name=sc.nextLine();
        emp.setVariable(name);
        System.out.println("Employe name: " + emp.getName());

        Adress ad=new Adress();
        System.out.println("Enter Street ");
        String strt=sc.nextLine();
        System.out.println("Enter City ");
        String city=sc.nextLine();
        System.out.println("Enter Pincode ");
        int pincode=sc.nextInt();
        ad.setdata(strt,city,pincode);

       System.out.println( ad.getstreet());
        System.out.println(ad.getcity());
        System.out.println(ad.getPincode());
    }
}
