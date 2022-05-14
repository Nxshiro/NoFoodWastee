package com.nofoodwaste.app.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUser extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    User findByEmailAndPassword(String email, String password);

}
