package com.finances.pocketsaverapi.repository;

import com.finances.pocketsaverapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
