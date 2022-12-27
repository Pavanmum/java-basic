import java.util.Scanner;
import java.util.*;

public class binary_to_decimal{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary  number:-");
        int n = sc.nextInt();
        
    
        int i = 0;
        int a = 1;

        while(n>0){
            int unit = n % 10;
            i += (unit*a);
            n /= 10;
            a *= 2;

        }
            System.out.print(i);
        
      
    }
}
