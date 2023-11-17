import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text you want to check palindrome : ");
        String str = scanner.next();

        if (isPalindrome(str)){
            System.out.println(str + " this is palindrome");
        }
        else {
            System.out.println(str + " it's not an palindrome");
        }
    }

    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;

        while (start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }

}
