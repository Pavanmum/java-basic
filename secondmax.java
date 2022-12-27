import java.util.*;
public class secondmax{
    static int Max(int[] arr){
        int mx = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
          if(arr[i] > mx){
            mx=arr[i];
          }
        
        }
        return mx;
    }
    static int secondmaxs(int[] arr){ 
        int mx = Max(arr);

        for(int i=0; i<arr.length; i++)
        {
          if(arr[i] == mx ){
            arr[i] = Integer.MIN_VALUE;
          }
        }
        int second = Max(arr);
        return second;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the "+n+" value");
        for(int i=0; i<n; i++)
        {
          arr[i] = sc.nextInt();
          
        }
        int mx = Integer.MIN_VALUE;
        System.out.print(secondmaxs(arr));

        

    }
}