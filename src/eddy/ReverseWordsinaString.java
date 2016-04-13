package eddy;

public class ReverseWordsinaString {

	public String reverseWords(String s) {
		if(s.length()==0) return s;
		StringBuffer sb = new StringBuffer();
//		if(s.substring(s.length()-1).equals(" ")) sb.append(" ");
		String[] ss = s.split(" ");
		if(ss.length==0) return "";
		ss = this.deleteblanks(ss);
		for(int j=0;j<ss.length;j++)
		{
			System.out.println(ss[j]);
		}
		for(int i=ss.length-1;i>=0;i--){
			sb.append(ss[i]);
			if(i>0) sb.append(" ");
		}
		return sb.toString();
	}
	
	public String[] deleteblanks(String[] ss){
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<ss.length;i++){
			if(ss[i].equals("")) continue;
			else sb.append(ss[i]+" ");

		}
		String[] s = sb.toString().split(" ");
		return s;
	}
}
