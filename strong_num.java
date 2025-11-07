import java.util.Scanner;
class strong_num
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the number");
int n = scn.nextInt();
int sum = 0;
int num = n;
while(n>0)
{
int d = n % 10;
int fact = 1;
for(int i = d;i>=1;i--)
{
fact *= i;
}
sum += fact;
n /= 10;
}
if(sum == num)
{
System.out.println("Strong Number");
}
else
{
System.out.println("Not a Strong number");
}
}
}