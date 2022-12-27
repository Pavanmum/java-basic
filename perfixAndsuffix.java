import java.util.Scanner;



public class perfixAndsuffix {
    static void printArr(int[] arr){
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int prefixs(int [] arr){
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
    static boolean suffix(int [] arr){
        int total = prefixs(arr);
        int prefix = 0;

        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            int su = total - prefix;
            if(prefix == su){
                return true;
            }
        
        }
        return false;
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
        System.out.println(suffix(arr)); 


    }
}
