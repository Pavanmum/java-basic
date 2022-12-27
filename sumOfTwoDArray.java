import java.util.Scanner;

public class sumOfTwoDArray {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
    static void sum(int [][]a1,  int r1,int c1,int [][] a2,int r2,int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Enter the proper value");
            return;
        }
        
        int [][] sums = new int [r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sums [i][j] = a1[i][j]+a2[i][j];
                
            }
            
        }
        printArray(sums);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st matrix row number");
        int r1 = sc.nextInt();
        System.out.println("Enter a 1st matrix column number");
        int c1 = sc.nextInt();
        int [][] a1 = new int[r1][c1];
        System.out.println("insert the "+r1*c1+"values according to row and column");
        for (int i = 0; i < r1; i++) {
            for(int j = 0;j<c1; j++){
            a1[i][j] = sc.nextInt(); 
            }
        }

        System.out.println("Enter a 2st matrix row number");
        int r2 = sc.nextInt();
        System.out.println("Enter a 2st matrix column number");
        int c2 = sc.nextInt();
        int [][] a2 = new int[r2][c2];
        System.out.println("insert the "+r2*c2+"values according to row and column");
        for (int i = 0; i < r2; i++) {
            for(int j = 0; j<c2; j++){
            a2[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("First matrix");
        printArray(a1);
        System.out.println("Seacond matrix");
        printArray(a2);
        System.out.println("Total matrix is:-");
        sum(a1, r1, c1, a2, r2, c2);





    }
}
