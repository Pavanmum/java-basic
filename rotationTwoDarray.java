import java.util.Scanner;

public class rotationTwoDarray {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
    static void transpose(int [][] arr,int r,int c){
        int temp = 0;
        for (int i = 0; i < c; i++) {
            for (int j = 1; j < r; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
                
            }
            
        }
    }
    static void reverse(int []arr){
        int i = 0,j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate(int [][]arr,int n){
        transpose(arr, n, n);

        for (int i = 0; i < n; i++) {
            reverse(arr[i]);
            
        }
    }
    public static void main(String[] args) {
       
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Row and Column number");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int [][] arr = new int [r][c];
            System.out.println("Enter a "+r*c+"value");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = sc.nextInt();
                }
                
            }
            rotate(arr, c);
            printArray(arr);

        
    }
}
