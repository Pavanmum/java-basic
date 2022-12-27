import java.util.Scanner;

public class findAnumberin2Darray {
    static void find(int [][]a,int c){
        int n = a.length;  
        int ans = -1;  
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j]==c){
                    System.out.println("Row = " +i);
                    System.out.println("col="+j);
                    return;
                    }
                
            }
            
        }System.out.println("-1");
        
}

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a row and column");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        
        int [][] a = new int[r1][c1];

        System.out.println("Enter a "+ r1*c1 +" value");
        for (int i = 0; i < r1; i++) {
            for (int j = 0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("which number you want to find");
        int c = sc.nextInt();

        find(a, c);

    }
    
}
