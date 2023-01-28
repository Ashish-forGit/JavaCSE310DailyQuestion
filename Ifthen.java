

import java.util.*;
public class Ifthen {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
         int age = obj.nextInt();

         if(age>=18)
         {
            System.out.println("Eligible to vote");
         }
         else
         {
            System.out.println("Not Eligible to vote");
         }
    }
}