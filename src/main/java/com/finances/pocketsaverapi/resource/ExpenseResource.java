package com.finances.pocketsaverapi.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseResource {

    @GetMapping(path = "/teste")
    public int teste() {
        return 1;
    }


}
