package com.arenz.budgetbunker.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long uid;
    
    @Column(name = "firstname", nullable = false, length = 50)
    private String firstname;

    @Column(name = "middlename", nullable = false, length = 50)
    private String middlename;

    @Column(name = "surname", nullable = false, length = 50)
    private String surname;

    @Column(name = "username", nullable = false, length = 50, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
}
