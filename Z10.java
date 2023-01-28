import java.util.Scanner;
import java.math.BigInteger;
import java .math.BigDecimal;
class Z10 {
    public static void main(String[] args){

        //create obj for scanner
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        // takes input from user
        String name = obj.nextLine();
         System.out.println("Enter Your gender: ");
        // takes input from user
        String gender = obj.next();
        System.out.println("Enter Your age: ");
        int age = obj.nextInt();
        System.out.println("Enter Your height: ");
        double ht = obj.nextDouble();
        System.out.println("enter a big integer: ");
        BigInteger value1 = obj.nextBigInteger();
        System.out.println("using nextBigInteger() : "+ value1);

        System.out.println("enter a big decimal: ");
        BigDecimal value2 = obj.nextBigDecimal();
        System.out.println("using nextBigDecimal() : "+ value2);




        //printing
       
        System.out.println("My Name is : "+ name);
        System.out.println("My age is : "+ age);
        System.out.println("My height is : "+ ht);
        System.out.println("My gender is : "+ gender);
    }
}