/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;
public class find_largeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y,z;
        x=input.nextInt();
        y=input.nextInt();
        z=input.nextInt();
        if(x>y && x>z){
            System.out.println("X is Large");
        }else if(y>x && y>z){
            System.out.println("Y is Large");
        }else{
            System.out.println("Z is Large");
        }
    }
}
