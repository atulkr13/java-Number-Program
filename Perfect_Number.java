import java.util.Scanner;
class Perfect_Number
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the Number");
int n = scn.nextInt();
int sum = 0;
for(int i = 1;i<=n/2;i++)
{
if(n % i == 0)
sum += i;
}
if(sum == n)
{
System.out.println("Perfect Number");
}
else
{
System.out.println("Not Perfect Number");
}
}
}