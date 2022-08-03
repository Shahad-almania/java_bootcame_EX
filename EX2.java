package day4;

import java.security.PublicKey;

/*Q2: Create a method that get a number as variable and check if this number is divided by 5 or not
 - Throw exceptions if the number is not divided by 5
 - Handle exception in main
 - Use throw and throws
*/
public class EX2 {
    public static void main(String args[])  {
        try{
            div(3);
        }catch (Exception e) {
            System.out.println(" Error");
        }
    }
    public static void div(int number)throws Exception  {
        if (number % 5 == 0)
    System.out.println(number+ " is divided by 5");
        else {
            throw new Exception();
        }

        }
        }

