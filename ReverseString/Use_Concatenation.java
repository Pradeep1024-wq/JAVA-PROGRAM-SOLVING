public class ReverseString {
	
	public void Use_Concatenation()
	{
		String str = "ABCD";
		String rev ="";
		int len = str.length();
		for(int i =len-1;i>=0;i--)
		{
			rev = rev +str.charAt(i);
		}
		System.out.println("THE REVERSE OF THE STRING: "+rev);
	}

	public static void main(String[] args) {
		ReverseString obj =new ReverseString();
		obj.Use_Concatenation();
	}
}
