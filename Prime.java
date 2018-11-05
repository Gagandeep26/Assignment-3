import java.util.Scanner;
public class Prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		int a = sc.nextInt();
		System.out.println("prime no. are = ");
		for(int no=1 ; no<=a ;no++)
		{
			int count =0;
		for(int i =2 ; i<=no-1 ; i++)
		{
			if(no%i==0)
			{
		        count=count+1;
		    }
		}
		    if(count==0)
		    {    
				System.out.println(no);
		    }
	    }
	
	}
}