import java.util.Scanner;
class Leap_year
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the year");
int y = scn.nextInt();
if(y % 400 == 0)
{
System.out.println("Leap Year");
}
else if(y % 4 == 0 && y % 100 != 0)
{
System.out.println("Leap Year");
}
else 
{
System.out.println("Not Leap Year");
}
}
}
