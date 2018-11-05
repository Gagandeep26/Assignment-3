import java.util.Scanner;
public class EvenNo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number = ");
		int even = sc.nextInt();
		System.out.println("even numbers are = ");
		for(int i =0 ; i <=even ; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		
		}
	}
}