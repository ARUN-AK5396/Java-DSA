public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {12,16,15,74,3,57};
        System.out.println(minValue(arr));
    }

    static int minValue(int[] arr){
        int ans = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index]<ans){
                ans = arr[index];

            }
        }
        return ans;

    }
}
