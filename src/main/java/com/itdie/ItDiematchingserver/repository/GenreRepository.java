package com.itdie.ItDiematchingserver.repository;

import com.itdie.ItDiematchingserver.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
