import java.util.Scanner;
class currancy_calculate
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the number");
int a = scn.nextInt();
if(a >= 2000)
{
System.out.println("2000 X"+(a / 2000));
a = a%2000;
}
if(a >= 500)
{
System.out.println("500 X"+(a / 500));
a = a%500;
}
if(a >= 200)
{
System.out.println("200 X"+(a / 200));
a = a%200;
}
if(a >= 100)
{
System.out.println("100 X"+(a / 100));
}
}
}
