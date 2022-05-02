public class constructorParameter
{
	constructorParameter()  // WITHOUT PARAMETER
	{
		System.out.println("THIS IS FIRST CONSTRUCTOR");
	}
	
	constructorParameter(int x)  // // WITH PARAMETER
	{
		System.out.println("THIS IS SECOND CONSTRUCTOR");
	}
	
	public static void main(String[] args) 
	{
		constructorParameter ob = new constructorParameter();
		constructorParameter obj = new constructorParameter(4);
	}
}
