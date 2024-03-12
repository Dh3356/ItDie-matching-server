package com.itdie.ItDiematchingserver.repository;

import com.itdie.ItDiematchingserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
