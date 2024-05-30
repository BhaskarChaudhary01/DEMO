//functional_interface
interface Calculator{
    int operation(int a,int b);
}
public class Main {
    public static void main(String[] args) {
        Calculator add=(a,b)->a+b;
        System.out.println("Addition =>"+add.operation(15,24));
        Calculator multiply=(a,b)->{
            int result=a*b;
            return result;
        };
        System.out.println("Multiplication =" +multiply.operation(15,24));
        Calculator substraction=(a,b)->a-b;
        System.out.println("Sunstration => "+substraction.operation(24,15));
        Calculator division=(a,b)->a/b;
        System.out.println("Division => "+division.operation(24,15));
    }
}