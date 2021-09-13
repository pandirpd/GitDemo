package Test;

public class Test2{
	
	static String address;
	String name,city;
	
	Test2(String name,String address,String city)
	{
		this.address=address;
		this.city=city;
		this.name=name;
	}
	public void getaddress()
	{
		System.out.println(address+" "+city+" "+name);
	}


	public static void main(String[] args) 
	{	
		Test2 ss=new Test2("Niki","india","Erode");
		Test2 ss1=new Test2("pandi","canada","Salem");
		ss.getaddress();
		ss1.getaddress();
	}
}
