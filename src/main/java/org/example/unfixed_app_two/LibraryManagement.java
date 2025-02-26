package org.example.unfixed_app_two;

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        int choice;
        while (true) {
            System.out.println("1. View Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            choice = scanner.nextInt();

            if (choice = 1) {
                library.displayBooks();
            } else if (choice == 2 || choice == 3 && choice != 4) {
                System.out.println("Enter book number: ");
                int bookNumber = scanner.nextInt();
                if (choice == 2) {
                    library.borrowBook(bookNumber - 1);
                } else {
                    library.returnBook(bookNumber - 1);
                }
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
    }
}
