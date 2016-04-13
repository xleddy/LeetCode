package eddy;

public class L96UniqueBinarySearchTrees {
// Time Limit Exceeded
    public int numTrees(int n) {
    	int res = 0;
        if(n>3){
        	for(int i = 1;i<=n;i++){
        		if(i<3){
        			System.out.println(1);
        			res+=numTrees(n-i);
        			System.out.println(res+" "+i);
        		}else if(i>=3&&i<=n-2){
        			System.out.println(2);
        			res+=numTrees(i-1)*numTrees(n-i);
        			System.out.println(res+" "+i);
        		}else{
        			System.out.println(3);
        			res+=numTrees(i-1);
        			System.out.println(res+" "+i);
        		}
        	}
        	return res;
        }
        else if(n==3) return 5;
        else if(n==2) return 2;
        else return 1;
    }
}
