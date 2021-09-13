package Test;

import java.util.ArrayList;

public class test {
	
	public static void main(String[] args) {
		int a[]= {2,5,2,8,2,5,8,5,9,10};
		
		ArrayList<Integer> ab=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			if(!ab.contains(a[i])) {
				ab.add(a[i]);
			//	System.out.println(ab);
				count++;
				
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i]==a[j]) {
						count++;
						
						
					}
					
				}
				System.out.println(a[i]);
				System.out.println(count+"=k");
				if(count==1)
					System.out.println(a[i]+"=u");
			}
			
		
			
		}
		
	}

}
