import java.util.Scanner;

import javax.xml.transform.Source;

public class repeat {
    public static int min(int[] arr) {
        int n = arr.length;
        int ans = -1;

        for(int i = 0;i<n;i++){
            for(int j= i + 1;j <n;j++){
                if (arr[i] == arr[j]){
                System.out.println(i+1);
                
                }
            }

        }
        return ans;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Array");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Insert the value of Array");
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        min(arr);
    }
    
}
