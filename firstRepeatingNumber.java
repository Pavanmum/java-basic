import java.util.*;
// import java.util.Arrays;

public class firstRepeatingNumber
{
    static int findMax(int[] a)
    {   
        
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++)
            {
                 if(a[i]==a[j]){
                    return a[i];
                }
            }
           
        }
        return -1;

    }
   
    public static void main(String args[])
	{
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a Array:- ");
       int n = sc.nextInt();
       int[] a = new int[n];
       System.out.println("Enter a "+ n +" values");
       for(int i=0; i<a.length; i++)
       {
        a[i] = sc.nextInt();
       }
      System.out.print(findMax(a));
    }
        
}     


