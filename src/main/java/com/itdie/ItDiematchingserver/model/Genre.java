package com.itdie.ItDiematchingserver.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
public class Genre {
    @Id
    @Column(updatable = false, unique = true, nullable = false)
    private int id;

    @Column(nullable = false, length = 20)
    private String name;
}
