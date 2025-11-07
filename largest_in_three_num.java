import java.util.Scanner;
class largest_in_three_num
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the year");
int a = scn.nextInt();
int b = scn.nextInt();
int c = scn.nextInt();
int d = a > b ? (a > c ? a:c) : (b > c ? b : c);
System.out.println(d);
}
}
