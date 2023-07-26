package com.finances.pocketsaverapi.resource;

import com.finances.pocketsaverapi.service.UserService;
import com.finances.pocketsaverapi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResouce {

    @Autowired
    UserService userService;

    @PostMapping(path = "/saveUser")
    public ResponseEntity<String> saveUser(@RequestBody User user){
        userService.saveUser(user);
        return ResponseEntity.ok().body("Salvo com sucesso");
    }


}
