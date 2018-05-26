package test;
import com.sun.javaws.exceptions.ExitException;

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("press 1 to begain\npress 2 to exit\n");
        int order = input.nextInt();
        if(order==1)
        {
            game();
        }
        else if(order==2)
        {
            return;
        }
    }

    public static int game(){
        int gnumber = (int)(Math.random()*100);
        int point = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("please insert a number");
        int guess=input.nextInt();
       while(guess!=gnumber) {
           if(guess>gnumber)
           {
               System.out.println(guess+"is too high!!");
               point++;
           }
           if(guess<gnumber)
           {
               System.out.println(guess+"is too low!");
               point++;
           }
           System.out.println("please insert a number");
           guess=input.nextInt();
       }
        point++;
        System.out.println("your score is "+point);
        System.out.println("press 1 to play again\npress 2 to exit");
        int order = input.nextInt();
        if(order==1)
        {
            game();
        }
        if(order==2)
        {return 0;}
        return 0;
    }
}
