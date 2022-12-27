import java.util.*;
class Dcoder
{
   public static void main(String args[])
   { 
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter the character:");
    String c=sc.next().toLowerCase();
    char ch= c.charAt(0);
    if(Character.isLowerCase(ch))
    {
      if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch== 'u')
    
        System.out.println(ch + " is an vowel");
   
      else
      {
        System.out.println(ch + " is an consonant");
      }
    }
    else if(ch>=0 && ch<=9)
    System.out.println(ch + " is a number");
    else
    System.out.println(ch + " is special character");
    }
}