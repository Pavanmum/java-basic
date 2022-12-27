import java.util.*;

public class decimal{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a decimal number:-");
        int n = sc.nextInt();
        int a = 0;
        int c = 1;

        while(n>0){
            int u = n%2;
            a += (u*c);
            c *= 10;
            n /= 2;
            
            
        }
        System.out.print(a);
        
    }
}