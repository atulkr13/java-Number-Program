import java.util.Scanner;
class second_largest_prime
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the Number");
int start = scn.nextInt();
int end = scn.nextInt();
int primecount = 0;
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
primecount++;
if(primecount == 2)
{
System.out.println(i);
break;
}
}
}
if(primecount < 2)
{
System.out.println("No Prime");
}
}
}

