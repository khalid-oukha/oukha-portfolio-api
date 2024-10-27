package com.oukha.portfolio.api.education.entity;

import com.oukha.portfolio.api.user.entity.User;
import jakarta.persistence.*;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User user;
}
