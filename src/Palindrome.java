public class Palindrome {
    public static void main(String[] args) {
        int n = 151;

        if(isPalindrome(n)){
            System.out.println(n + " its an palindrome");
        }else {
            System.out.println( n + " its not an palindrome");
        }
    }
    public static boolean isPalindrome(int n){
        int sum = 0;
        int originalNum = n;
        while (n != 0){
            int digits = n % 10;
            sum = sum * 10 + digits;
            n = n/10;
        }
        return sum == originalNum;
    }
}
