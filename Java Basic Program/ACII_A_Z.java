import java.util.Scanner;
public class ACII_A_Z {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ASCII VALUE: A-Z");
       char ch;int value,count=0;
       for(ch='A'; ch<='Z';ch++){
           value=ch;
           System.out.printf("%c = %d\t",ch,value);
           count++;
           if(count==4){
               System.out.println("");
               count=0;
           }
       }
    }
}
