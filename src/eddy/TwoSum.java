package eddy;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int[] res = null;
		for(int i=0;i<nums.length;i++){
			for(int j=i;j<nums.length;j++){
				if((nums[i]+nums[j])==target&&i!=j){
					res = new int[2];
					res[0] = nums[i];
					res[1] = nums[j];
				}
			}
		}
		return res;
    }
	
	public int[] order(int[] i){
		boolean flag = true;
		int temp = 0;
		while(flag == true){
			flag = false;
			for(int j=0;j<i.length-1;j++){
				if(i[j+1]<i[j]){
					flag = true;
					temp = i[j+1];
					i[j+1] = i[j];
					i[j] = temp;
				}
			}
		}
		return i;
	}
}
