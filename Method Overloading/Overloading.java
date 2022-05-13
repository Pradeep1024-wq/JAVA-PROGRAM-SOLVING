public class Overloading
{  
	  void sum(int a,long b)
	  {
		  System.out.println("Sum of two no :" + (a+b));
	  }  
	  void sum(int a,int b,int c)
	  {
		  System.out.println("Sum of three no :" +(a+b+c));
	  }  
	  
	  public static void main(String args[])
	  {  
		  Overloading obj=new Overloading();  
		  obj.sum(10,27);  
		  obj.sum(10,24,29);  
	  }  
}
