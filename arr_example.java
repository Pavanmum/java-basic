import java.util.Scanner;
public class arr_example {

    public static void main(String[] args) {
        System.out.println("How many numbers you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double total = 0;

        for(int i=0; i<n; i++){
        	System.out.print("Enter Element No."+(i+1)+": ");
        	arr[i] = scanner.nextDouble();
        }
        for(int i=0; i<n; i++){
        	total = total + arr[i];
        }
        double average = total / n;
        
        System.out.printf("The average is: %.3f", average);
    }
}