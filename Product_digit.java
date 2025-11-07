import java.util.Scanner;
class Product_digit
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the number");
int n = scn.nextInt();
int product = 1;
while(n > 0)
{
int m = n%10;
product *= m;
n = n/10;
}
System.out.println(product);
}
}
