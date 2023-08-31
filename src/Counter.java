import java.util.Scanner;
public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter the lower number");
        int lowerNumber = terminal.nextInt();
        System.out.println("\nEnter the higher number");
        int highestNumber = terminal.nextInt();

        try {
            count(lowerNumber, highestNumber);
        } catch (InvalidParamsException e) {
            System.out.println(e.message);
        }
    }

    /**
     *
     * @param lowNum an integer that's used as base for counting
     * @param highNum an integer that's used as limit for counting;
     *                the difference between @highNum and @lowNum is
     *                counted and printed on terminal
     * @throws InvalidParamsException
     * @return void
     */
    static void count(int lowNum, int highNum) throws InvalidParamsException {
        int maxCount = highNum - lowNum;
        int maxNumberAllowed = 500;

        System.out.println("\nCount number > " + maxCount + "\n");

        if (maxCount <= 0)
            throw new InvalidParamsException("The numbers you've entered results in 0 or less\nTry again!");

        if (maxCount > maxNumberAllowed)
            throw new InvalidParamsException("The maximum number allowed to count is 500\nTry again!");

        for (int i = 1; i <= maxCount; i++) {
            System.out.println("Counting > " + i);
        }
    }
}
