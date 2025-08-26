package com.example.bookbuddy;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
      List<Book>  books = new ArrayList<>();

      Book book1 = new Book(1, "book-1");
      Book book2 = new Book(2, "book-2");
      Book book3 = new Book(3, "book-3");

      books.add(book1);
      books.add(book2);
      books.add(book3);

      System.out.println("These are the available books");
      for (Book book: books){
        System.out.println("ID: " + book.getId() + " Name: " + book.getName());
      }
    
    }


}
