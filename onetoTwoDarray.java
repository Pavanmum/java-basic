import java.util.Scanner;

public class onetoTwoDarray {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
    static void twoDarraya(int [][] a, int r1 , int c1){
        
        // int [][] ans = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
            
            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st matrix row number");
        int r1 = sc.nextInt();
        System.out.println("Enter a 2st matrix column number");
        int c1 = sc.nextInt();
        int [][] a = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for(int j = 0;j<c1; j++){
           a[i][j] = sc.nextInt();
        }}
        twoDarraya(a, r1, c1);
    }
}
