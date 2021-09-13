package Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  int a[]= {4,5,5,5,5,4,9,8,9,4};
		  ArrayList<Integer> ab=new ArrayList<Integer>();
		  
		  for(int i=0;i<a.length;i++) {
			  int k=0;
			  if(!ab.contains(a[i])) {
				  ab.add(a[i]);
				  System.out.println(ab);
				  k++;
				  System.out.println("1------");
				  for(int j=i+1;j<a.length;j++) {
					  System.out.println(j+"=v="+i);
					  if(a[i]==a[j]) {
						  k++;
						  System.out.println("2-----k="+k);
					  }
				  }
				  System.out.println(a[i]);
				  System.out.println("k="+k);
				  if(k==1)
					  System.out.println(a[i]+" unique");
			  }
		  }
		 }    
		}    