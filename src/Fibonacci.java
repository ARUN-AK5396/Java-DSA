import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of to be print fibonacci : ");
        int n = scanner.nextInt();

        int temp1 = 0;
        int temp2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(temp1 + " ");
            int value = temp1 + temp2;

            temp1 = temp2;
            temp2 = value;

        }
    }
}
