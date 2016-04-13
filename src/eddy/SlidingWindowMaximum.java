package eddy;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
    	if(nums.length==0) return nums;
    	int[] result = new int[nums.length-k+1];
        int start = 0,end = start+k-1,max = 0;
        if(k == 1) return nums;
        else if(nums.length == k){
        	result[0] = max(start,end,nums);
        }
        while(end<nums.length){
        	max = max(start,end,nums);
        	result[start] = max;
        	start++;
        	end++;
        }
        return result;
    }
    public int max(int start,int end,int[] nums){
    	int max = nums[end];
    	for(int i = start;i<end;i++){
    		if(nums[i]>max) max = nums[i];
    	}
    	return max;
    }
}
