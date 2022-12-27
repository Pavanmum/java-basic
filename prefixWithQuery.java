import java.util.Scanner;

public class prefixWithQuery {

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
        int[] arr = new int[n+1];
        System.out.println("Enter a arrray");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int [] k = prefixs(arr);
        printArr(k);
        System.out.println("Enter a Number");
        int c = sc.nextInt();

        while(c-- >0){
            System.out.println("First query");
            int d = sc.nextInt();
            System.out.println("Second query");
            int f = sc.nextInt();
            int ans;
            ans = arr[f] - arr[d-1];
            System.out.println(ans);
                
            }

        }
        

    }


    

