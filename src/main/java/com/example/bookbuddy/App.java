package com.example.bookbuddy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5432/mydb";
    String user = "admin";
    String password = "admin123";

    try (Connection conn = DriverManager.getConnection(url, user, password)) {
      System.out.println(conn.getMetaData().toString());
      System.out.println("Connection successful;");
    } catch (Exception e) {
      System.err.println("Connection failed;");
      e.printStackTrace();
    }

    List<Book> books = new ArrayList<>();

    Book book1 = new Book(1, "book-1");
    Book book2 = new Book(2, "book-2");
    Book book3 = new Book(3, "book-3");

    books.add(book1);
    books.add(book2);
    books.add(book3);

    System.out.println("These are the available books");
    for (Book book : books) {
      System.out.println("ID: " + book.getId() + " Name: " + book.getName() + " UUID: " + book.getUUID());
    }

  }

}
