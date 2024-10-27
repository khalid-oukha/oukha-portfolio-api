package com.oukha.portfolio.api.experience.entity;

import com.oukha.portfolio.api.user.entity.User;
import jakarta.persistence.*;

@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User user;
}
