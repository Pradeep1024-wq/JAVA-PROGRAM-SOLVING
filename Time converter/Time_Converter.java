import java.util.Scanner;

public class Time_Converter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE DAYS :");
		int days = sc.nextInt();
		
		int hours = days*24;
		System.out.println("TOTAL HOURS :"+hours);
		
		int mins = hours*60;
		System.out.println("TOTAL MINS :"+mins);
		
		int secs = mins*60;
		System.out.println("TOTAL SECS :"+secs);
	}
}
