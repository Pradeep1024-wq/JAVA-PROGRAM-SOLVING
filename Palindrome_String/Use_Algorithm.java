import java.util.Scanner;

public class Palindrome_String 
{
	public void Use_Algorithm()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER :");
		String n = sc.nextLine();
		String p = n;
		
		String rev ="";
		int len = n.length();
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+n.charAt(i);
		}
		if(p.equals(rev))
		{
			System.out.println(p+" THIS NUMBER IS PALINDROME STRING");
		}else {
			System.out.println(p+" THIS NUMBER IS NOT PALINDROME");
		}
	}

	public static void main(String[] args) 
	{
		Palindrome_String obj = new Palindrome_String();
		obj.Use_Algorithm();
	}

}
