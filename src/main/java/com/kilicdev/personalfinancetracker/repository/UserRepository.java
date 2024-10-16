package com.kilicdev.personalfinancetracker.repository;

import com.kilicdev.personalfinancetracker.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
  @Query("SELECT u FROM User u WHERE u.userName = :userName OR u.email = :email")
  Optional<User> findByUserNameOrEmail(
      @Param("userName") String userName, @Param("email") String email);
}
