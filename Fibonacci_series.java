import java.util.Scanner;
class Fibonacci_series
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the Number");
int n = scn.nextInt();
int a = 0;
int b = 1;
int c = 0;
for(int i = 1;i<=n;i++)
{
c = a+b;
a = b;
b = c;
}
System.out.println(c);
}
}
