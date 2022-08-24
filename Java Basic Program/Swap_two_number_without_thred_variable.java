
public class Swap_two_number_without_thred_variable {
    public static void main(String[] args) {
        int x=10,y=15;
       x=x+y;
       y=x-y;
       x=x-y;
        System.out.printf("After SWap : x = %d \t  Y = %d\n",x,y);
    }
}
