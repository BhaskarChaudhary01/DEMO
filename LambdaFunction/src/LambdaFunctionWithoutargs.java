interface Greeting{
    public void greet();
}
public class LambdaFunctionWithoutargs {
    public static void main(String[] args) {
        Greeting inhindi=()->{ System.out.println("JAI RAMJI KI"); };
        inhindi.greet();
        Greeting inEnglish=()->{ System.out.println("Good Morning"); };
        inEnglish.greet();
    }
}
