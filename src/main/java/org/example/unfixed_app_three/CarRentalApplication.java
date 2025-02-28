package org.example.unfixed_app_three;

import java.util.Scanner;

public class CarRentalApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] carModels = {"Sedan", "SUV", "Convertible", "Truck"};
        double[] basePrices = {50.0, 70.0, 100.0, 80.0};
        String[] carTypes = {"Economy", "Luxury", "Sports", "Utility"};
        int[] carAges = {3, 5, 2, 7};
        boolean[] isAvailable = {true, true, true, true};

        System.out.println("Choose a car model:");
        for (int i = 0; i < carModels.length; i++) {
            System.out.println((i + 1) + ". " + carModels[i] + " (" + carTypes[i] + ")");
        }

        int carChoice = scanner.nextInt();
        scanner.nextLine();

        if (carChoice < 1 || carChoice>carModels.length){
            System.out.println("Invalid car model");
        }
        else if (!isAvailable[carChoice]) {
            System.out.println("Sorry, this car is currently unavailable.");
        } else {
            double basePrice = basePrices[carChoice];
            int carAge = carAges[carChoice];
            System.out.println("Car model: " + carModels[carChoice]);
            System.out.println("Car age: " + carAge + " years");

//            double ageAdjustment = 0.0;  //instead of if-else condition below use Ternary Operator
//            if (carAge > 5) {
//                ageAdjustment = 0.9;
//            } else {
//                ageAdjustment = 1.1;
//            }

            double ageAdjustment = (carAge > 5) ? 0.9 : 1.1;

            basePrice *= ageAdjustment;

            System.out.print("Enter rental duration in days: ");
            int days = scanner.nextInt();
            scanner.nextLine();

            double totalPrice = basePrice * days;

            if (days > 7) {
                totalPrice *= 0.80;
            } else if (days > 3) {
                totalPrice *= 0.90;
            }

            double taxRate = 0.15;
            double totalWithTax = totalPrice * (1 + taxRate);

            System.out.println("Total price before tax: $" + totalPrice);
            System.out.println("Total price with tax: $" + totalWithTax);

            System.out.println("Select your car type:");
            for (int i = 0; i < carTypes.length; i++) {
                System.out.println((i + 1) + ". " + carTypes[i]);
            }

            int carTypeChoice = scanner.nextInt();
            double carTypeDiscount = getCarTypeDiscount(carTypeChoice);


            totalWithTax *= carTypeDiscount;

            System.out.println("Total price after car type discount: $" + totalWithTax);

            System.out.print("Enter your payment method (1 for Credit Card, 2 for PayPal): ");
            int paymentChoice = scanner.nextInt();
            paymentMethod(paymentChoice);

        }
    }

    public static double getCarTypeDiscount(int carTypeChoice) {
        double carTypeDiscount;
        switch (carTypeChoice) {   // use this switch inside separate method
            case 1:
                carTypeDiscount = 0.95;
                break;
            case 2:
                carTypeDiscount = 0.85;
                break;
            case 3:
                carTypeDiscount = 0.90;
                break;
            case 4:
                carTypeDiscount = 1.0;
                break;
            default:
                carTypeDiscount = 1.2;
                break;
        }
        return carTypeDiscount;
    }

    public static void paymentMethod(int paymentChoice){
        switch (paymentChoice) {   //use this switch inside separate method
            case 1:
                System.out.println("You chose Credit Card.");
                break;
            case 2:
                System.out.println("You chose PayPal.");
                break;
            default:
                System.out.println("Invalid payment method.");
                break;
        }
    }

}

