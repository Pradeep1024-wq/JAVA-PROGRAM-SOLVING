public class Swaping {
	
	public void Use_Thrid_Variable()
	{
		System.out.println("SWAPING THE TWO VARIABLE USEING THRID VARIABLE\n");
		int a = 10;
		int b = 24;
		System.out.println("THE VALUE OF A:"+a+"\nTHE VALUE OF B:"+b +"\n");
		System.out.println("AFTER SWAPING THE VARIABLE\n");
		int t = a;
		a = b;
		b = t;
		System.out.println("THE VALUE OF A:"+a+"\nTHE VALUE OF B:"+b);
	}
	public static void main(String[] args) {
		Swaping obj = new Swaping();
		obj.Use_Thrid_Variable();
	}
}
