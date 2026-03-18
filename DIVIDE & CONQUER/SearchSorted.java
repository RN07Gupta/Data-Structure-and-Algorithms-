class SearchSorted{

    public static int search(int[] nums , int target){
         int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[s] <= nums[mid]) {
                if (nums[s] <= target && target < nums[mid]) {
                    e = mid - 1;   // search left
                } else {
                    s = mid + 1;   // search right
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[e]) {
                    s = mid + 1;   // search right
                } else {
                    e = mid - 1;   // search left
                }
            }
        }

        return -1; // target not found
    }
    public static void main(String[]args){
        int nums[] ={4,5,6,7,0,1,2}; 
        int target = 0;

        System.out.println(search(nums , target));


    }
}