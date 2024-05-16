public class ArmstrongNO {
    // Method to calculate the number of digits in the number
    public static int countDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return 1 + countDigits(number / 10);
    }

    // Recursive method to calculate the sum of digits each raised to the power of the total number of digits
    public static int sumOfPower(int number, int power) {
        if (number == 0) {
            return 0;
        }
        int digit = number % 10;
        return (int) Math.pow(digit, power) + sumOfPower(number / 10, power);
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int numDigits = countDigits(number);
        int sum = sumOfPower(number, numDigits);
        return sum == number;
    }

    public static void main(String[] args) {
        int number = 153; // Example number to check

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
