public class swap{
    static void sw(int a,int b){
        System.out.println("before value of a is " + a);
        System.out.println("before value of b is"  + b);
        int temp = a;
         a = b;
         b  = temp;
         System.out.println("After value of a is " + a);
         System.out.println("After value of b is"  + b);
    }
    public static void main(String args[])
    {
        int a = 9 , b= 3;
        sw(a,b);
        
    }
}