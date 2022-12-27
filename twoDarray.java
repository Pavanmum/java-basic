import java.util.Scanner;

public class twoDarray {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a row of the array");
        int r = sc.nextInt();
        System.out.println("Enter  a column of the array");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("fill the " + r * c + "Array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        printArray(arr);

    }
}
