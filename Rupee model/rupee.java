public class rupee 
{ 
	public void useforloop()
	{
		int i;
		int row = 7;
		
		for(i=0 ;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("$ ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		rupee obj = new rupee();
		obj.useforloop();
	}
}
