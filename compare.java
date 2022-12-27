import java.util.Scanner;

public class compare {
    static void array(int[] arr, int n1, int n2) {
        int g = arr.length;
        int left = n1;
        int right = n2 - 1;
        for (int i = 0; i < g; i++) {
            if (arr[left] < arr[right]) {
                System.out.println("True");
                break;
            } else {
                System.out.println("False");
                break;
            }

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter a Size of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the 1st value of array");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2st value of array");
        int n2 = sc.nextInt();
        array(arr, n1, n2);

    }

}
