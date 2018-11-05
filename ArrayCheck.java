import java.util.Scanner;
public class ArrayCheck
{
	public static void main(String[] args)
	{
		int a [] ={ 1,4,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number=");
		int no= sc.nextInt();
		
		boolean ans=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==no)
             {
				System.out.println("it is in the array");
				ans=true;
				break;
			  }
			}
			if(ans==false)
			{
				System.out.println("no,it is not in the array" );
			}
    }
}
	
		

	
