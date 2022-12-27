import java.util.Scanner;

public class multipleTwoDarray {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
    static int[][] mutiples(int [][] a1,int r1,int c1,int [][] a2,int r2,int c2){
        if(c1!=r2){
            System.out.println("values write proply");
            return null;
        }
        int [][] a = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int j2 = 0; j2 < c1; j2++) {
                    a[i][j] += (a1[i][j2]*a2[j2][j]);
                    
                }
                
            }
            
        }
        return a;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first row and column");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][]a1 = new int[r1][c1];
        System.out.println("Enter a "+r1*c1+"values");
        for (int i = 0; i <r1 ; i++) {
            for (int j = 0; j < c1; j++) {
                a1[i][j] = sc.nextInt(); 
            }
            
        }

        System.out.println("Enter the value of Second row and second column" );
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][]a2 = new int[r2][c2];
        System.out.println("Enter a "+r2*c2+"values");
        for (int i = 0; i <r2 ; i++) {
            for (int j = 0; j < c2; j++) {
                a2[i][j] = sc.nextInt(); 
            }
            
        }
        printArray(mutiples(a1, r1, c1, a2, r2, c2));
        
        
        
    }

}
