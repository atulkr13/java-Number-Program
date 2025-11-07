import java.util.Scanner;
class Reverse_Number
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the Number");
int n = scn.nextInt();
int reverse = 0;
while(n > 0)
{
int rem = n%10;
reverse = (reverse*10)+rem;
n /= 10;
}
System.out.println(reverse);
}
}