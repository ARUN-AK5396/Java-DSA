import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter The First numbers : ");
        Scanner first = new Scanner(System.in);
        int num1 = first.nextInt();

        System.out.print("Enter the second number : ");
        Scanner second = new Scanner(System.in);
        int num2 = second.nextInt();

        int result = num1+num2;

        System.out.println("The sum of two number is : "+result);
    }
}