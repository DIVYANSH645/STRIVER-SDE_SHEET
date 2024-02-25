package DAY_1_ARRAY;
import java.util.*;
class NextPermutation {
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1,5,8,4,7,6,5,3,1};
        nextPermutation(nums1);
        System.out.println(Arrays.toString(nums1)); // Expected output: [1, 3, 2]

        // Test case 2
        int[] nums2 = {3, 2, 1};
        nextPermutation(nums2);
        System.out.println(Arrays.toString(nums2)); // Expected output: [1, 2, 3]

        // Test case 3
        int[] nums3 = {1, 1, 5};
        nextPermutation(nums3);
        System.out.println(Arrays.toString(nums3)); // Expected output: [1, 5, 1]

    }

   
     static public void nextPermutation(int[] nums)
    {  int i=nums.length-2;
     while(i>=0 && nums[i+1]<=nums[i])i--;
     if(i>=0){
         int j= nums.length-1;
         while(nums[j]<=nums[i]){
             j--;
         }
         swap(nums,i,j);
        }
     reverse(nums,i+1);
          
      }
    

    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int nums[], int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}

