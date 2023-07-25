package com.finances.financesapi.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DespesaRecurso {

    @GetMapping(path = "/teste")
    public int teste() {
        return 1;
    }
}
