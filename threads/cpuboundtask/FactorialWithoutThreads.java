package threads.cpuboundtask;

import java.math.BigInteger;

public class FactorialWithoutThreads {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int targetNumber = 100000; // Calculate factorial of this number

        // Calculate the factorial
        BigInteger factorial = calculateFactorial(targetNumber);

        System.out.println("Factorial of " + targetNumber + " is: " + factorial);

        // Record the end time
        long endTime = System.currentTimeMillis();

        // Calculate and print the execution time in milliseconds
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " milliseconds");
           
    }

    // Calculate the factorial using a loop
    private static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
