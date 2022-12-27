import java.util.Scanner;



public class prefix {
    static void printArr(int[] arr){
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] prefixs(int [] arr){
        

        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        
            
          
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter a arrray");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int [] k = prefixs(arr);
        printArr(k);


    }
}
