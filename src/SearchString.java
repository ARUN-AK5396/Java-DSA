public class SearchString {
    public static void main(String[] args) {
        String txt = "ARUN AK";
        char target = 'n';

        System.out.println(Search(txt,target));
    }
    static boolean Search(String str , char target){
        if (str.length()==0){
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)){
                return true;
            }

        }
        return false;
    }
}
