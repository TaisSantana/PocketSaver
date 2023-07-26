package com.finances.pocketsaverapi.service;

import com.finances.pocketsaverapi.entity.User;
import com.finances.pocketsaverapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
