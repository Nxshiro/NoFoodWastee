package com.nofoodwaste.app.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IShop extends JpaRepository<Shop, Long> {

    Optional<User> findByCata(String categorie);
    Optional<User> findByCity(String city);
    Shop findByName(String name);
}
