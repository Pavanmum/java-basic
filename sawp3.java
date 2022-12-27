import java.util.*;

public class sawp3{
    static void print(int[] arr){
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static int[] sp(int[] arr){
        int c =arr.length;
        int[] ans = new int[c];
        int j = 0;
        int i = c-1;
        while(i>=0){
            ans[j++] = arr[i];
            i--;
        }
        return ans;
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
        int[] ans = sp(arr);
        print(ans);
       
    }
}