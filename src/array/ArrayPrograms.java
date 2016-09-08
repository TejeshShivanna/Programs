package array;

public class Programs {

    public int firstMissingPositive(int[] nums) {
        if(nums == null) return Integer.MAX_VALUE;
        if(nums.length == 0) return 1;
        int[] count = new int[nums.length+1];
        int maxIndex = 0;
        for(int num: nums){
            if(num>0){
                count[num] = 1;
                maxIndex = (maxIndex<num)?num:maxIndex;
            }
        }
        for(int i=1; i<nums.length+1; i++){
            if(count[i]!=1)return i;
        }
        return Integer.MAX_VALUE;
    }
}
