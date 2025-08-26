package com.example.bookbuddy;

import com.example.bookbuddy.entity.Book;
import com.example.bookbuddy.utils.Jpa;
import jakarta.persistence.EntityManager;

import java.util.List;

public class App {
  public static void main(String[] args) {
    EntityManager em = Jpa.em();
    List<Book> books = em
        .createQuery("select b from Book b order by b.id", Book.class)
        .getResultList();

    books.forEach(System.out::println);

    em.close();
    Jpa.close();
  }
}
