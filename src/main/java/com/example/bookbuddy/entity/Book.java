package com.example.bookbuddy.entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, columnDefinition = "uuid")
    private UUID uuid;

    public Book() {}

    public Book(String name) {
        this.name = name;
    }

    @PrePersist
    public void ensureUuid() {
        if (uuid == null) uuid = UUID.randomUUID();
    }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public UUID getUuid() { return uuid; }
    public void setId(Integer id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setUuid(UUID uuid) { this.uuid = uuid; }

    @Override
    public String toString() {
        return "Book{id=%d, name='%s', uuid=%s}".formatted(id, name, uuid);
    }
}
