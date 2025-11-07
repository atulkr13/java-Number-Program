import java.util.Scanner;
class decimal_to_binary
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the Number");
int n = scn.nextInt();
String s = "";
while(n > 0)
{
int bit = n%2;
s = bit + s;
n /= 2;
}
System.out.println(s);
}
}