import java.util.Scanner;
class Lcm_Number
{
public static void main(String[] args)
{
System.out.println("Enter the number");
Scanner scn = new Scanner(System.in);
int num1 = scn.nextInt();
int num2 = scn.nextInt();
int gcd = 1;
for(int i = 1;i<=num1 && i <= num2;i++)
{
if(num1 % i == 0 && num2 % i == 0)
gcd = i;
}
int lcm = (num1*num2)/gcd;
System.out.println(lcm);
}
}