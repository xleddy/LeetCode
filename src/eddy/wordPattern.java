package eddy;

import java.util.*;

public class wordPattern {

	public boolean wordPattern(String pattern, String str) {
		String[] cc = pattern.split("");
		String[] ss = str.split(" ");
		if(pattern.equals("")) return false;
		Map<String,String> m = new HashMap<String,String>();
		if(ss.length!=cc.length||(pattern==""&&str!=null)) return false;
		for(int i=0;i<ss.length;i++){
			if(matchkey(m,cc[i])){
				if(m.get(cc[i]).equals(ss[i])) continue;
				else return false;
			}else if(matchval(m,ss[i])) return false;
			else m.put(cc[i], ss[i]);
			
		}
		
		return true;
	}
	
	public boolean matchkey(Map<String,String> m,String key){
		Iterator<String> keys = m.keySet().iterator();
		while(keys.hasNext()){
			if(key.equals(keys.next())) return true;
		}
		return false;
	}
	public boolean matchval(Map<String,String> m,String val){
		Iterator<String> keys = m.keySet().iterator();
		while(keys.hasNext()){
			String key = keys.next();
			if(val.equals(m.get(key))) return true;
		}
		return false;
	}
}
