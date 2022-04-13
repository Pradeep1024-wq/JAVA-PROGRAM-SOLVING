public class Swaping {
	
	public void Use_Add_and_Sub()
	{
		System.out.println("SWAPING THE TWO VARIABLES USEING ADD AND SUB\n");
		int a = 10;
		int b = 24;
		System.out.println("THE VALUE OF A:"+a+"\nTHE VALUE OF B:"+b +"\n");
		System.out.println("AFTER SWAPING THE VARIABLES\n");
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("THE VALUE OF A:"+a+"\nTHE VALUE OF B:"+b);
	}
	public static void main(String[] args) {
		Swaping obj = new Swaping();
		obj.Use_Add_and_Sub();
	}
}
