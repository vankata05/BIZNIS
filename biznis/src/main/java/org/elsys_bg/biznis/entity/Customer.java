package org.elsys_bg.biznis.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    // other fields, constructors, and getters/setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        // Check for a valid ID value
        if (id != null && id <= 0) {
            throw new IllegalArgumentException("Invalid ID value");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Check for a non-null and non-empty name
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // Check for a non-null and valid email format
        if (email == null || !email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.email = email;
    }
}
