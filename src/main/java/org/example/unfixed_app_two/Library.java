package org.example.unfixed_app_two;

public class Library {
    Book[] books = new Book[3]; // Hardcoded array size

    public Library() {
        books[0] = new Book("The Catcher in the Rye");
        books[1] = new Book("To Kill a Mockingbird");
        books[2] = new Book("1984");
        books[3] = new Book("Moby Dick"); // ArrayIndexOutOfBoundsException
    }

    public void displayBooks() {
        System.out.println("Books Available:");
        for (int i = 0; i <= books.length; i++) {
            System.out.println((i + 1) + ". " + books[i].title + " - " + (books[i].isBorrowed ? "Borrowed" : "Available"));
        }
    }

    public void borrowBook(int index) {
        if (index < 0 || index >= books.length) {
            System.out.println("Invalid book selection");
        } else if (books[index].isBorrowed) {
            System.out.println("Book already borrowed");
        } else {
            books[index].isBorrowed = true;
            System.out.println("You borrowed: " + books[index].title);
        }
    }

    public void returnBook(int index) {
        if (index < 0 || index >= books.length) {
            System.out.println("Invalid book selection");
        } else {
            books[index].isBorrowed = false;
            System.out.println("You returned: " + books[index].title);
        }
    }
}
