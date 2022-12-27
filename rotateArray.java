import java.util.*;
public class rotateArray{
     static void print(int[] arr){
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static int[] sp(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        int [] ans = new int[n];
        int j = 0;
        for(int i=n-k; i<n;i++){
            ans[j++]=arr[i];
         }
         for(int i=0; i<n-k;i++){
            ans[j++]=arr[i];
         }

         return ans;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Insert a Array ");
        for(int i=0; i<n; i++)
        {
          arr[i] = sc.nextInt();
        }
        System.out.println("Enter k:");
        int k = sc.nextInt();
        System.out.println("Original Array");
        print(arr);
        int[] ans = sp(arr,k);
        System.out.println("After rotation");
        print(ans);


    }
}