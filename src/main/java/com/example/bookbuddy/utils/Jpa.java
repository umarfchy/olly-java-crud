package com.example.bookbuddy.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public final class Jpa {
    private static final EntityManagerFactory EMF =
            Persistence.createEntityManagerFactory("booksPU");

    private Jpa() {}

    public static EntityManager em() {
        return EMF.createEntityManager();
    }

    public static void close() {
        EMF.close();
    }
}
