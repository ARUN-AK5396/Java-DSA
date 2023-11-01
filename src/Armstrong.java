public class Armstrong {
    public static void main(String[] args) {
        int n = 158;
        if(isArm(n)){
            System.out.println(n + "  this is armstrong number");
        }
        else {
            System.out.println( n + " its not an armstrong number");
        }
    }
    public static boolean isArm(int n){
        int sum = 0;
        int originalNum = n;
        int length = count(n);

        while (n != 0){
            int digits = n % 10;
            sum += Math.pow(digits,length);
            n = n/10;
        }
        System.out.println(sum);
        return sum == originalNum;
    }
    static int count(int n){
        int count = 0;
        while (n > 0){
            n = n/10;
            count ++;
        }
        System.out.println(count);
        return count;

    }

}
