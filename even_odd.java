import java.util.Scanner;
class even_odd
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the year");
int n = scn.nextInt();
boolean res = n%2 == 0 ? true : false;
System.out.println(res);
}
}

