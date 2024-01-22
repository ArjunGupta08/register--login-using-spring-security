package com.ad.registerLoginUsingSpringSecutity.repository;

import com.ad.registerLoginUsingSpringSecutity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    public User findByEmail(String emaill);

}