import java.util.Scanner;

public class transver {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
    static void mutiples(int [][] a1){
       int n = a1.length-1; 
       for (int i = n-1; i >= 0; i--) {
        for (int j = n-1; j>=0; j--) {
             System.out.print(a1[i][j]+" ");
            
        }
        System.out.println();
       }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first row");
        int r1 = sc.nextInt();
        System.out.println("Enter the value of Second Column");
        int c1 = sc.nextInt();
        int[][]a1 = new int[r1][c1];
        System.out.println("Enter a "+r1*c1+"values");
        for (int i = 0; i <r1 ; i++) {
            for (int j = 0; j < c1; j++) {
                a1[i][j] = sc.nextInt(); 
            }
            
        }

    
       mutiples(a1);
        
        
        
    }

}
