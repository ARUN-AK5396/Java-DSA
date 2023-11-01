public class StringReturn {
    public static void main(String[] args) {
//        String out = msg();
//        System.out.println(out);
        int out = sum(10,20);
        System.out.println(out);
    }
//  pass the value when you are calling the function
    static int sum(int a , int b){
        int ans = a+b;
        return ans;
    }
    static String msg(){
        String txt = "Hello dude!...  come on you can do!..";
        return  txt;
    }
}
