import java.util.Scanner;
class largest_prime_range
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the Number");
int start = scn.nextInt();
int end = scn.nextInt();
for(int i = end;i>=start;i--)
{
if(i <= 1) continue;
boolean flag = true;
for(int j = 2;j<=i/2;j++)
{
if(i % j == 0)
{
flag = false;
break;
}
}
if(flag)
{
System.out.println(i);
break;
}
}
}
}
