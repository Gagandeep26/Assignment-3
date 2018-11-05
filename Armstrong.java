import java.util.Scanner;
public class Armstrong
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the number=");
int no= sc.nextInt();
int temp1=no;
int length=0;
while(temp1 !=0)
{
length=length+1;
temp1=temp1/10;
}
int temp2= no;
int arm=0;
int rem;
while(temp2!=0)
{
int mul = 1;
rem = temp2%10;
for(int i = 1; i<= length ; i++)
{
mul = mul*rem;
}
arm= arm+mul;
temp2=temp2/10;
}
if(no==arm)
{
System.out.println("it is armstrong number");
}
else
{
System.out.println("it is not armstrong number");
}
}
}