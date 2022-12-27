import java.util.Scanner;


public class sprialPatternDmatrix{
    static void printArr(int[][] arr){
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
       
        static void sprial(int [][] arr,int r,int c){
            int  topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
            int totalNumber=0;
            while(totalNumber<r*c){
                for (int j = leftCol; j <= rightCol && totalNumber<r*c; j++) {
                    System.out.print(arr[topRow][j]+" ");
                    totalNumber++;
                }
                topRow++;
                for (int i = topRow; i <= bottomRow && totalNumber<r*c; i++){
                    System.out.print(arr[i][rightCol]+" ");
                    totalNumber++;

                }
                rightCol--;
                for (int j = rightCol; j >= leftCol && totalNumber<r*c; j--) {
                    System.out.print(arr[bottomRow][j]+" ");
                    totalNumber++;

                }
                bottomRow--;
                for (int i = bottomRow; i >= topRow & totalNumber<r*c; i--) {
                    System.out.print(arr[i][leftCol]+" ");
                    totalNumber++;

                }leftCol++;
            }
        }
        
            public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Array row and column");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int [][] arr = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr [i][j] = sc.nextInt();
                }
                
            }
            sprial(arr, r, c);
            printArr(arr);
            


        
            }
        }
    
