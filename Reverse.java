import java.util.Scanner;
public class Reverse
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int no = sc.nextInt();
		int rev =0;
		int rem;
		while(no!=0)
		{
			rem = no %10;
			rev = rev*10+rem;
            no=no/10;
		}
		System.out.println("reverse of a number = " +rev);
	}

}