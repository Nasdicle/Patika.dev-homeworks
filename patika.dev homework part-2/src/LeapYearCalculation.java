package MyJavaPatika.devHomeworks;

import java.util.Scanner;

public class LeapYearCalculation {
    public static void main(String[] args) {

        System.out.println("------Leap Year Calculation--------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scan.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is leap year.");
            } else
                System.out.println(year + " is not leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is leap year.");
        } else
            System.out.println(year + " is not leap year.");

    }

}