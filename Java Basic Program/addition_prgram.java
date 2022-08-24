import java.util.Scanner;
public class addition_prgram {
   static int sum(int x,int y, int z){
       int sum;
       sum=x+y+z;
       return sum;
   }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y,z;
        x=input.nextInt();
        y=input.nextInt();
        z=input.nextInt();
        int result=sum(x,y,z);  
        System.out.println("Total Summation is: "+result);
    }

   
}
