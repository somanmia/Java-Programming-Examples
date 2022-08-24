import java.util.Scanner;
public class average_twonumber {
    static double avg(double x,double y){
        double average;
        average=(x+y)/2;
        return average;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double x,y;
        System.out.print("Enter First Number:  ");
        x=input.nextDouble();
        System.out.print("Enter Second Number: ");
        y=input.nextDouble();
       
        System.out.printf("Average is : %.2f\n",avg(x,y));
    }
}
