package com.oukha.portfolio.api.image.entity;

import com.oukha.portfolio.api.project.entity.Project;
import com.oukha.portfolio.api.user.entity.User;
import jakarta.persistence.*;

@Entity
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;
}
