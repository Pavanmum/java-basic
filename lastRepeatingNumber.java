import java.util.*;

public class lastRepeatingNumber{
    
        static int lastrepeat(int[] arr)
        {
            int ans= -1;
            int n = arr.length;
            for(int i=0; i<n; i++)
            {
                    for(int j=i+1; j<n; j++)
                            {
                                if(arr[i]==arr[j]){
                                    ans = arr[i];
                                    
                                }
                                
                            
                            }
                             
                    }
        
            return ans;
        }          
    
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Array size");
            int n =sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the array values:- ");
            for(int i=0; i<arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.print(lastrepeat(arr));


        }
    
    }