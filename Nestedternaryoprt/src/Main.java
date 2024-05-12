import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units  ");
        int un = scanner.nextInt();

        int bill=(un<=100)?(un*2):((un>100 && un<150)?(un*3):((un>=150 && un<200)?(un*4):(un>=201 && un<250)?(un*5):(un>=250 && un<300)?(un*6):(un>=300 && un<500)?(un*7):(un*8)));

        System.out.println(bill);

    }
}