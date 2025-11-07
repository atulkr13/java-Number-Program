import java.util.Scanner;
class largest_in_two_num
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the year");
int a = scn.nextInt();
int b = scn.nextInt();
if(a > b)
{
System.out.println(" a is largest");
}
else if(a < b)
{
System.out.println(" b is largest");
}
else
{
System.out.println("Both are equal");
}
}
}