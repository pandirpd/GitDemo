package Test;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args)
	{		
		ArrayList<String> a =new ArrayList<String>();
		a.add("Pandi");
		a.add("Niki");
		a.add(1, "Love");
		System.out.println(a);	
		boolean aa=a.contains("Love");
		System.out.println(aa);
	}

}
