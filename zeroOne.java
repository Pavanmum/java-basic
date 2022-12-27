import java.util.Scanner;

public class zeroOne {
    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void coverter(int arr[]){
        int n = arr.length;
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
            zeros++;
            }
        }

        for (int i = 0; i < n; i++) {
            if(i < zeros){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Array");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Insert the value of Array");
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Orignal Array");
        printArr(arr);
        coverter(arr);
        System.out.println("Sorted array");
        printArr(arr);
        

    }
}
