import java.util.Scanner;
import java.util.*;

public class InchesToFeet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int INCHES_IN_A_FOOT = 12;

        String inchString;
        String feetString;
        String inchesInString;
        int inchesIn = 0;
        int inches;
        int feet;

        try {
            System.out.print("How many inches?: ");

            inchesIn = sc.nextInt();

            feet = inchesIn / INCHES_IN_A_FOOT;
            inches = inchesIn % INCHES_IN_A_FOOT;

            if (inchesIn == 1) {
                inchesInString = " inch ";
            } else {
                inchesInString = " inches ";
            }

            if (inches == 1) {
                inchString = " inch ";
            } else {
                inchString = " inches ";
            }

            if (feet == 1) {
                feetString = " foot ";
            } else {
                feetString = " feet ";
            }

            System.out.println(inchesIn + inchesInString + "is equal to " + feet + feetString + "+ " + inches + inchString);

        } catch (InputMismatchException e) {
            System.out.println("Not a valid Integer");
        }


    }
}