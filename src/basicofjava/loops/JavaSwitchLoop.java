package basicofjava.loops;

import java.util.Scanner;

public class JavaSwitchLoop {

    public static void main(String[] args) {
        //String days = "12345";

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the valid day..");
        String days = sc.nextLine();

        switch (days) {
            case "Monday":
                System.out.println("Monday is a office day..");
                break;
            case "Tuesday":
                System.out.println("Tuesday is a Work day..");
                break;
            case "Wednesday":
                System.out.println("Wednesday is a colorful day..");
                break;
            case "Thursday":
                System.out.println("Thursday is a fast day..");
                break;
            case "Friday":
                System.out.println("Friday is a weekend start day..");
                break;
            case "Saturday":
                System.out.println("Saturday is a trip day..");
                break;
            case "Sunday":
                System.out.println("Sunday is a holiday..");
                break;
            default:
                System.out.println("please select the correct day..");
                break;
        }

    }
}
