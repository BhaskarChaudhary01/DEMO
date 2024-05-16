public class Factorial {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5; // Example number to calculate factorial

        int result = factorial(number);
        System.out.println("The factorial of " + number + " is " + result);
    }
}
