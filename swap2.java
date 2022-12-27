public class swap2{
    static void sp(int a,int b){
        a = a +  b; // a = 9,b = 3 final a = 12
        b = a - b;  // a = 12,b = 3 final b = 9
        a = a - b;  // a = 12 ,b = 9 final a = 3 
        System.out.println("value of a is " + a);
        System.out.println("value of b is"  + b);
    }
    public static void main(String args[])
    {
        int a = 9, b = 3;
        sp(a,b); // call the method without a object,use static method.
    }
}