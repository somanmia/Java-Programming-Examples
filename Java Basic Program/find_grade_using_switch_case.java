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
public class grade_result {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int score;
        score=input.nextInt();
        String grade="";
        if(score>=0 && score<=100){
             switch(score/10){
            case 8:
            case 9:
            case 10:
                grade="A+";
                break;
            case 7:
                grade="A";  break;
            case 6:
                grade="A-";
                break;
            case 5:
                grade="B";
                break;
            case 4:
                grade="C";
            default:
                grade="F";
                break;
              
        }
            
        }else{
            System.out.println("Envalid Score");
        }
       
        System.out.println(grade);
    }
}
