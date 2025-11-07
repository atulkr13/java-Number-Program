import java.util.Scanner;
class Binary_to_decimal
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the binary number:");
        int n = scn.nextInt();
        
        int dec = 0;   
        int p = 1;     
        
        while(n > 0)
        {
            int rem = n % 10;   
            dec = dec + (rem * p); 
            n = n / 10;         
            p = p * 2;          
        }
        
        System.out.println("Decimal value: " + dec);
    }
}
