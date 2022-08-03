package day4;
/*Make an array size 7
        and print the 9th index
        array index out of bonds error should appear
        use try and catch to handle it */

public class EX1 {
        public static void main(String args[]) {
            try {
                int Array[] = {1, 2, 3, 4, 5, 6, 7};
                System.out.println(Array[9]);
            } catch (Exception e) {
                System.out.println(" Error");
            }
        }
}
