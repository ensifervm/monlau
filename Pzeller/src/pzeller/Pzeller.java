package pzeller;

import java.util.Scanner;

/*
 * @author isaaccosdon
 */
public class Pzeller {
    private static Scanner keyboard = new Scanner(System.in);
    private static String[] daysOfTheWeek={ "Sunday",  "Monday", "Tuesday","Wednesday",
        "Thursday", "Friday","Saturday"};
    
    public static void main(String[] args) {
        int d, y; 
        System.out.print("Year: ");
        y = keyboard.nextInt();
        if(isLeapYear(y))
            d = 12;
        else
            d = 13;
        System.out.print(daysOfTheWeek[dayOfWeekZeller(d,9,y)]);
        System.out.println(" " + d + " of September.");
    }
    
    private static int dayOfWeekZeller(int day, int month, int year){
         int a, y, m, d;
            a = (14 - month) / 12;
            y = year - a;
            m = month + 12 * a - 2;
            d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
            return d;
    }
    
    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}
