import java.util.Scanner;

public class whileloopwithuserinput {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("INITIATION VALUE 0 TO 5 :");
		int num = sc.nextInt();
		while (num < 6) 
		{
			  System.out.println("THIS IS WHILE LOOP  "+num);
			  num++;
		}
	}
}
