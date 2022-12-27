import java.util.Scanner;

public class transposeMatrix {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
    static int[][] transpose(int [][] arr,int r,int c){
        int [][] ans = new int [c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];                
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter the "+r*c+" values");
        int [][]arr = new int [r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                
            }
            
        }
        int [][] ans = transpose(arr, r, c);
        printArray(ans);
    }
}
