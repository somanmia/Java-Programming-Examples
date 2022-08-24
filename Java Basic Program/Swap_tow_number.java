import java.util.Scanner;
public class Swap_tow_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y,temp;
        System.out.print("Enter X , Y: ");
        x=input.nextInt();
       y=input.nextInt();
      System.out.printf("Before SWap : X = %d\t Y= %d", x,y);
        temp=x;
        x=y;
        y=temp;
         System.out.printf("\nAfter SWap : X = %d\t Y= %d\n", x,y);
}
}