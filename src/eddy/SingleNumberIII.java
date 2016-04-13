package eddy;

import java.util.ArrayList;
import java.util.List;

public class SingleNumberIII {

	public int[] singleNumber(int[] nums) {
		List i = new ArrayList();
		for(int k = 0;k<nums.length;k++){
			 if(i.contains(nums[k])) i.remove((Object)nums[k]);
			 else i.add(nums[k]);
		}
		int[] ii = new int[i.size()];
		for(int l = 0;l<i.size();l++){
			ii[l] = (int)i.get(l);
		}
		return ii;
	}
}
