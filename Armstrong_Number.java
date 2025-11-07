import java.util.Scanner;
class Armstrong_Number
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the Number");
int n = scn.nextInt();
int num = n;
int count = 0;
while(n > 0)
{
count++;
n /= 10;
}
System.out.println(count);
n = num;
int sum = 0;
while(n >0)
{
int d = n%10;
int product = 1;
for(int i = 1;i<=count;i++)
{
product *= d;
}
System.out.println(product);
sum += product;
n /= 10;
}
System.out.println(sum);
if(sum == num)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not Armstrong Number");
}
}
}