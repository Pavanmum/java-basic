import java.util.*;


public class swap3inplace {
    static void print(int[] arr){
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static void swapArrayMethod(int[] arr, int i,int j){
        int temp = arr[i];
        arr [i] = arr[j];
        arr[j]= temp;   
    }
    static void sw(int[] arr){
        int n = arr.length;
        int i = 0 , j = n-1;
        while(i<j){
            swapArrayMethod(arr,i,j);
            i++;
            j--;
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array no");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Insert the no");
        for(int i=0; i<n; i++)
        {
          arr[i]=sc.nextInt();
        }
        sw(arr);
        print(arr);
    }
}