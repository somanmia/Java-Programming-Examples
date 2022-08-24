import java.util.Scanner;
public class ASCII_value {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        int value,sum=0;
        System.out.print("Enter Name: ");
        String str=input.next(); 
        
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            value=ch;
            sum+=value;
            System.out.printf("%c = %d\n",ch,value);
        }
        System.out.printf("Total Summation ASCII VALUE: %d\n",sum);

        
    }
}
