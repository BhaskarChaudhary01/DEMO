public class drassiumno {
    // Recursive method to calculate the sum of digits
    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 10) + sumOfDigits(number / 10);
    }

    // Method to check if the number is a Dudeney number
    public static boolean isDudeney(int number) {
        // Calculate the cube root of the number
        int cubeRoot = (int) Math.round(Math.cbrt(number));

        // Check if the cube root, when cubed, equals the number
        if (cubeRoot * cubeRoot * cubeRoot != number) {
            return false;
        }

        // Calculate the sum of digits of the number
        int sum = sumOfDigits(number);

        // Check if the sum of digits is equal to the cube root
        return sum == cubeRoot;
    }

    public static void main(String[] args) {
        int number = 512; // Example number to check

        if (isDudeney(number)) {
            System.out.println(number + " is a Dudeney number.");
        } else {
            System.out.println(number + " is not a Dudeney number.");
        }
    }
}
