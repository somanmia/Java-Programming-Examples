import java.util.Scanner;
public class total_and_average_mark {
    static void totalMarks(double x,double y,double z){
         double total;
         total=x+y+z;
         System.out.printf("Total Marks: %.2f\n",total);
    }
    static void averageMark(double x,double y,double z){
        double average=(x+y+z)/3;
        System.out.printf("Average Mark: %.2f\n",average);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double x,y,z;
        System.out.print("Enter Number X: ");
        x=input.nextDouble();
        System.out.print("Enter Number Y :");
        y=input.nextDouble();
        System.out.print("Enter Number Z :");
        z=input.nextDouble();
        totalMarks(x, y, z);
        averageMark(x, y, z);
    }
}
