package threads.cpuboundtask;

import java.math.BigInteger;

public class MultithreadedFactorial {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int numThreads = 4; // Number of threads to use
        int targetNumber = 100000; // Calculate factorial of this number

        // Create an array to hold the results from each thread
        BigInteger[] results = new BigInteger[numThreads];
        Thread[] threads = new Thread[numThreads];

        // Split the factorial calculation across multiple threads
        for (int i = 0; i < numThreads; i++) {
            final int threadNumber = i;
            threads[i] = new Thread(() -> {
                BigInteger partialResult = calculatePartialFactorial(targetNumber, numThreads, threadNumber);
                results[threadNumber] = partialResult;
            });
            threads[i].start();
        }

        // Wait for all threads to complete
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Combine the results from all threads to get the final factorial
        BigInteger finalResult = BigInteger.ONE;
        for (BigInteger partialResult : results) {
            finalResult = finalResult.multiply(partialResult);
        }

        System.out.println("Factorial of " + targetNumber + " is: " + finalResult);

        // Record the end time
        long endTime = System.currentTimeMillis();

        // Calculate and print the execution time in milliseconds
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " milliseconds");
    }

    // Calculate a portion of the factorial
    private static BigInteger calculatePartialFactorial(int target, int numThreads, int threadNumber) {
        BigInteger partialResult = BigInteger.ONE;
        for (int i = threadNumber + 1; i <= target; i += numThreads) {
            partialResult = partialResult.multiply(BigInteger.valueOf(i));
        }
        return partialResult;
    }
}
