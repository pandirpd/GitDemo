package Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class treeMap {
	
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "Niki");
		hm.put(12, "Pandi");
		hm.put(23, "Samyuktha");
		hm.put(7, "Love");
		hm.put(5, "Babe");
		
		System.out.println(hm.get(0));
		System.out.println(hm.get(12));
		
		Set sn=hm.entrySet();
		Iterator it=sn.iterator();
		
		while(it.hasNext()) {
		//	System.out.println(it.next());
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	
	}

}
