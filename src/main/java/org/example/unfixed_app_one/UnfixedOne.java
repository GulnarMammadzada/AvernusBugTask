package org.example.unfixed_app_one;

import java.util.Arrays;

public class UnfixedOne {
    public static void main(String[] args) {
        int number = 7;
        if (number == 5) {
            System.out.println("Number is 5");
        } else if (number > 5 && number < 10) {
            System.out.println("Number is between 5 and 10");
        } else {
            System.out.println("Number is something else");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        int count = 5;
        while (count > 0) {
            System.out.println("Count: " + count);
            count--;
        }

        int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;

        int x = 10;
        int y = 20;
//        int min = x > y ? x : y; //Use Math class to find min value
        int min=Math.min(x,y);
        System.out.println(min);

    }
}
