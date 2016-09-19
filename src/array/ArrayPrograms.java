package array;

import java.util.HashMap;

public class ArrayPrograms {

    public int firstMissingPositive(int[] nums) {
        if (nums == null) return Integer.MAX_VALUE;
        if (nums.length == 0) return 1;
        int[] count = new int[nums.length + 1];
        int maxIndex = 0;
        for (int num : nums) {
            if (num > 0) {
                count[num] = 1;
                maxIndex = (maxIndex < num) ? num : maxIndex;
            }
        }
        for (int i = 1; i < nums.length + 1; i++) {
            if (count[i] != 1) return i;
        }
        return Integer.MAX_VALUE;
    }

    public int[] plusOne(int[] digits) {
        if (digits.length != 0) {
            int len = digits.length;
            int c = 1;
            int sum = 0;
            for (int i = len - 1; i > -1; i--) {
                sum = c + digits[i];
                if (sum > 9) {
                    sum = 0;
                    c = 1;
                } else {
                    c = 0;
                }
                digits[i] = sum;
            }
            if (c != 0) {
                int[] newdigits = new int[len + 1];
                newdigits[0] = 1;
                return newdigits;
            }
        }
            return digits;
    }

    public int removeElement(int[] nums, int val) {
        int i=0,j=0;
        if(nums.length>0){
            while(j<nums.length){
                if(nums[j]!=val){
                    nums[i] = nums[j];
                    i++;
                }
                j++;
            }
        }
        return i;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        if(nums == null || nums.length==0) return ans;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hmap.containsKey(target-nums[i])){
                ans[0] = hmap.get(target-nums[i]);
                ans[1] = i;
                break;
            }
            else{
                hmap.put(nums[i], i);
            }
        }
        return ans;
    }
}
