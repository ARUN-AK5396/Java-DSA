import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {13,56,20,8,-33,23,98,-34,94,12};

        System.out.print("Enter the search number : ");
        Scanner res = new Scanner(System.in);
        int target = res.nextInt();

        int ans = LinearSearch(nums,target);
        System.out.println("The Position of the number is .."+ans);

    }

    static int LinearSearch(int[] arr , int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];

            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
