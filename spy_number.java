import java.util.Scanner;
class spy_number
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the number");
int n = scn.nextInt();
int sum = 0;
int prod = 1;
while(n>0)
{
int a = n % 10;
sum += a;
prod *= a;
n /= 10;
}
if(sum == prod)
{
System.out.println("Spy number");
}
else
{
System.out.println("Not Spy number");
}
}
}