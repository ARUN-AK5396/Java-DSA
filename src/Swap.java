import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.print("Enter the first number : ");
        Scanner num1 = new Scanner(System.in);
        int a = num1.nextInt();

        System.out.print("Enter the second number");
        Scanner num2 = new Scanner(System.in);
        int b = num2.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + "  " +b);

    }
}
