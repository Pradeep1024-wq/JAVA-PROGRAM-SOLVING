public class ReverseString {
	
	public void Use_Char_Array()
	{
		String str = "ABCD";
		String rev ="";
		char a[] =str.toCharArray();
		int len = a.length;
		
		for(int i=len-1;i>=0;i--)
		{
			rev =rev+a[i];
		}
		System.out.println("THE REVERSE OF THE STRING :"+rev);
	}

	public static void main(String[] args) {
		ReverseString obj =new ReverseString();
		obj.Use_Char_Array();
	}
}
