package com.itdie.ItDiematchingserver.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Entity
@Builder
@RequiredArgsConstructor
public class User {
    @Id
    private String studentId;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 20)
    private String sex;

    @Column(nullable = false, length = 20)
    private String phoneNumber;
}
