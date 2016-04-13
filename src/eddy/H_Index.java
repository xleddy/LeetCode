package eddy;

public class H_Index {
	
	public int hIndex(int[] citations) {
		if(this.findmax(citations)==0) return 0;
		int flag = 0;
		if(this.findmin(citations)>=citations.length) return citations.length;
		else{
			for(int i=citations.length;i>0;i--)
			{
				flag = 0;
				for(int j=0;j<citations.length;j++)
				{
					if(citations[j]>=i) flag++;
				}
				if(flag==i) break;
			}			
			return flag;
		}
	}
	
	public int findmin(int[] citations){
		int ci=citations[0];
		for(int i=1;i<citations.length;i++)
		{
			if(i<ci) ci = i;
		}
		return ci;
	}
	
	public int findmax(int[] citations){
		int ci=citations[0];
		for(int i=1;i<citations.length;i++)
		{
			if(i>ci) ci = i;
		}
		return ci;
	}
}
