import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the String you want to reverse  :  ");
        String str = scanner.next();

        String value = reverse(str);
        System.out.println(str + " this your text");
        System.out.println(value + " reversed text");
    }

    public static String reverse(String str){
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length()-1;

        while (start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start ++;
            end--;
        }
        return new String(charArray);
    }
}
