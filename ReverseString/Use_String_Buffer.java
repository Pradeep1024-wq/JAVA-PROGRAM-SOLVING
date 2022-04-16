public class ReverseString {
	
	public void Use_String_Buffer()
	{
		String str ="ABCD";
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev =sb.reverse();
		System.out.println("THE REVERSE OF THE STRING :"+rev);
	}

	public static void main(String[] args) {
		ReverseString obj =new ReverseString();
		obj.Use_String_Buffer();
	}
}
