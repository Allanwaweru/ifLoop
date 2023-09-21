public class ifLoop {
    public static void main(String[] args) {
        // loop to display a string 99 times.
        for (int i = 0; i < 99; i++) {
            System.out.println("Iteration: " + (i + 1));
        }

        // loop to display every odd number from 0 to 99.
        for (int i = 1; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // loop to display every even number from 0 to 99.
        for (int i = 0; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // loop to display every even number from 0 to 99.
        for (int i = 0; i <= 99; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // loop that will sum up the odd numbers from 0 to 99 and print it at the end.
        int oddSum = 0;
        for (int i = 1; i <= 99; i += 2) {
            oddSum += i;
        }
        System.out.println("Sum of odd numbers from 0 to 99: " + oddSum);

        // loop that will sum up the even numbers from 0 to 99 and print it at the end.
        int evenSum = 0;
        for (int i = 0; i <= 99; i += 2) {
            evenSum += i;
        }
        System.out.println("Sum of even numbers from 0 to 99: " + evenSum);

        // loop that finds a sum of the numbers between two numbers given by the user, inclusive.
        int start = 10;
        int end = 20;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from " + start + " to " + end + " inclusive: " + sum);
    }
}
