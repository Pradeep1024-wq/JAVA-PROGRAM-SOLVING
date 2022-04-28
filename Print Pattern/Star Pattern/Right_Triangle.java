public class Right_Triangle 
{ 
	public void useforloop()
	{
		int i;
		int row = 5;
		
		for(i=0 ;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
  
	public static void main(String[] args) 
	{
		Right_Triangle obj = new Right_Triangle();
		obj.useforloop();
	}
  
}
