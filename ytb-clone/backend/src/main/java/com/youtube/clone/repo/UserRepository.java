package com.youtube.clone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.youtube.clone.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}