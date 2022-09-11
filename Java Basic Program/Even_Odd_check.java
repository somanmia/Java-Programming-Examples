/*import java.util.Scanner;
public class Even_Odd_check {
  static boolean   find_odd_even(int n){
      
      if(n%2==0){
          return true;
      }
      else{
          return false;
      }
      
      
  }
    public static void main(String[] args) {
        int number;
        boolean result=false;
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        result=find_odd_even(number);
        if(result){
            System.out.println(number+" is a Even Number");
        }else{
            System.out.println(number+" is a Odd Number");
        }
    }
}
*/

// ====== 2=======
/*import java.util.Scanner;
public class Even_Odd_check{
    static boolean find_even_odd(int n){
       int option=n%2;
       switch(option){
           case 0:
               return true;
           case 1:
               return false;
       }
       return false;
    }
    
    public static void main(String[] args) {
         boolean result;
         int number;
         Scanner input=new Scanner(System.in);
         number=input.nextInt();
         result=find_even_odd(number);
         if(result){
             System.out.println("Even Number");
         }else{
             System.out.println("Odd Number");
         }
    }
}
*/

// =========== BIG NUMBER ODD EVEN CHECK MIN 100 DIGIT===========//
import java.util.Scanner;
public class Even_Odd_check{
   static boolean find_even_odd(String  n){    
       char ch=n.charAt(n.length()-1);
       if(ch%2==0){
           return true;
       }else{
           return false;
       }
       
   }
    public static void main(String[] args) {
        String str;
        boolean result;
        Scanner input=new Scanner(System.in);
        str=input.next();
        result=find_even_odd(str);
        if(result){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}


















