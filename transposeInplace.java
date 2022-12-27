import java.util.Scanner;

public class transposeInplace {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
    static void Inplace(int [][]arr,int r,int c){
        int temp = 0;
        for (int i = 0; i < c; i++) {
            for (int j = 1; j < r; j++) {
            temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row and Column number");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int [r][c];
        System.out.println("Enter a "+c*r+"value");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();    
                
            }
            
        }
        Inplace(arr, r, c);
        printArray(arr);
    }
}
