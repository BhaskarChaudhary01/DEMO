public class Primenumber {
    // Method to check if a number is prime using recursion
    public static boolean isPrime(int number, int divisor) {
        // Base case 1: If number is less than 2, it is not prime
        if (number < 2) {
            return false;
        }
        // Base case 2: If divisor reaches the number itself, it is prime
        if (divisor == number) {
            return true;
        }
        // Base case 3: If number is divisible by any number other than 1 and itself, it is not prime
        if (number % divisor == 0) {
            return false;
        }
        // Recursive case: Check the next divisor
        return isPrime(number, divisor + 1);
    }

    public static void main(String[] args) {
        int number = 29; // Example number to check

        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
