import java.util.Scanner;
class prime_number
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the Number");
int n = scn.nextInt();
boolean flag = true;
for(int i = 2;i<=n/2;i++)
{
if(n % i == 0)
{
flag = false;
break;
}
}
if(n > 1 && flag)
{
System.out.println("Prime Number");
}
else
{
System.out.println("Not Prime Number");
}
}
}
