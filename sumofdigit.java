import java.util.Scanner;
class sumofdigit
{
public static void main(String[] args)
{
System.out.println("Enetr the number");
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int sum = 0;
while(n>0)
{
int a = n%10;
sum += a;
n /= 10;
if(n==0 && sum>9)
{
n = sum;
sum = 0;
}
}
System.out.println(sum);
}
}
