import java.util.Scanner;

public class suffix {
    static void printArr(int[] arr){
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int [] suffix(int[] arr){
        int n = arr.length;
        int[] suf =  new int[n];
        suf[n-1] = arr [n-1];
         
        
        for (int i = n-2 ; i >= 0; i--) {
           suf[i] = suf[i+1] + arr[i];        
        } 
        return suf;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int []a = suffix(arr);
        printArr(a);
    }
}
