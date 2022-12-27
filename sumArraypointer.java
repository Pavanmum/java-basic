import java.util.Scanner;

public class sumArraypointer {
    static void pointor(int[] arr,int c){
        int q = arr.length;
        int n1 = 0 , n2=n1 + 1;
        for(int i = 0;i<q;i++){
            for(int j = i+1;j<q;j++){
                if(arr[i]+arr[j]==c){
                    System.out.print(++i+","+ ++j);
                    return;
                }
            }

        } System.out.println(-1);
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:-");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Arrays:-");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int c = sc.nextInt();
        pointor(arr, c);




    }
    
}
