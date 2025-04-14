// Exercise 1: Build a Library System
// Goal: Use encapsulation, inheritance, and polymorphism.

// Requirements:

// Create an abstract class LibraryItem with:

// String title, int id

// Abstract method void displayInfo()

// Create subclasses:

// Book → has String author

// Magazine → has int issueNumber

// Create a class Library with a list of items:

// Method to addItem(LibraryItem item)

// Method to displayAllItems()

// 🧠 Bonus: Try method overriding with displayInfo() in both Book and Magazine.

import java.util.ArrayList;
import java.util.List;

abstract class LibraryItem{
    String title;
    int id;
    abstract void displayInfo();
}

class Book extends LibraryItem{
    String author;
    void displayInfo(){
        System.out.println( id + " " + title + " " + author);
    }
}
class Magazine extends LibraryItem{
    int issueNumber;
    void displayInfo(){
        System.out.println( id + " " + title + " " + issueNumber );
    }
}
class Library{
    List<LibraryItem> Libraryitems = new ArrayList<>(); 
    
    public void addItem(LibraryItem item){
        Libraryitems.add(item);
    }
    public void displayAllItems(){
        for(LibraryItem item : Libraryitems){
            item.displayInfo();
        }
    }
}

public class OOP_ex1{
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book();
        book.title = "Jonny";
        book.id = 5;
        library.addItem(book);
        library.displayAllItems();
    }
}