package com.test.b.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("b")
public class ResourceB {

    @GetMapping("/{id}")
    public EntityDTO getSomeData(@PathVariable("id") Integer id) {
        return new EntityDTO(id);
    }
}
