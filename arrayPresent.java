import java.util.Scanner;

public class arrayPresent {
    static int[] frequency(int[] arr){
        
        int[] fre = new int[100005];

        for(int i=0;i<arr.length;i++){
            fre[arr[i]]++;
        }
        return fre;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Insert a value");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int[] frequency = frequency(arr);
        System.out.println("Enter number of quires");
        int q = sc.nextInt();
        // print(arr);

        while(q>0){
            System.out.println("Enter a query");
            int c = sc.nextInt();
            if(frequency[c]>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            q--;
        }
    }

}
