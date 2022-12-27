import java.util.Scanner;

public class pointerEvenOdd{
    static void swap(int[] arr,int right,int left){
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }
    static void printArr(int[] arr){
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void pointer(int[] arr){
        int n = arr.length;
        int right = n-1, left = 0;
        while(right>left){
            if(arr[right]%2 == 0 && arr[left] == 1){
                swap(arr,right,left);
                right--;
                left++;
            }
            if(arr[right]%2 == 1 ){
                right--;
            }
            if(arr[left]%2 == 0){
                left++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Orignal Array");
        printArr(arr);
        pointer(arr);
        System.out.println("Sorted array");
        printArr(arr);


    }
}
