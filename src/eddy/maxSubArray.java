package eddy;

public class maxSubArray {
	// Time Limit Exceeded
	public int maxSubArray(int[] nums) {
		
		int sum = findmax(0,nums);
		for(int i=1;i<nums.length;i++){
			if(sum<findmax(i,nums)) sum = findmax(i,nums);
		}
		return sum;
	}
	
	public int findmax(int index,int[] nums){
		int max  = 0;
		int index2 = 0;
		if(index==nums.length-1) return nums[nums.length-1];
		else{
			max = nums[index];
			for(int i=index+1;i<nums.length;i++){
				index2 = i;
				if(sum(index,index2,nums)>max) max = sum(index,index2,nums);
			}
			
			return max;
		}
	}
	
	public int sum(int index1,int index2,int[] nums){
		int sum = nums[index1];
		for(int i=index1+1;i<=index2;i++){
			sum += nums[i];
		}
		return sum;
	}
}
