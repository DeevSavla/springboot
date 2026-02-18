import java.util.*;

//row = 3 , column = 5
//[2 1 2]
//[1 3 1]
//[0 5 0]
public class pattern {

    void diamond() {
        int row = 3;
        int col = 5;
        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= (row - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= (row - i); k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        pattern p1 = new pattern();
        p1.diamond();
    }
}

// 2 options either create an object of pattern class to use diamond function as
// it is non static

// or else name it as static void diamond() to call it directly in main().

// static method can only run in static methods.