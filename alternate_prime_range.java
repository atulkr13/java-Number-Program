import java.util.Scanner;
class alternate_prime_range
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the Number");
int start = scn.nextInt();
int end = scn.nextInt();
boolean printprime = true;
for(int i = start;i<=end;i++)
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
if(printprime)
{
System.out.println(i);
}
printprime =! printprime;
}
}
}
}

