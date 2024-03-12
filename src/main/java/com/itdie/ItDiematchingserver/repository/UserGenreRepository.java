package com.itdie.ItDiematchingserver.repository;

import com.itdie.ItDiematchingserver.model.UserGenre;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGenreRepository extends JpaRepository<UserGenre, UUID> {
}
