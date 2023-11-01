public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {64,19,78,82,12,65,-63};
        int target = 65;

        System.out.println(SearchTag(arr,target,2,5));
    }
    static int SearchTag(int[] arr , int target , int start,int end){
        if (arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end ; index++) {
            int element = arr[index];

            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
