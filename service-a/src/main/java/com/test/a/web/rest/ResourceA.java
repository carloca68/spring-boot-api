package com.test.a.web.rest;

import com.test.a.web.dto.OtherDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("a")
public class ResourceA {

    @PostMapping()
    public @ResponseBody
    ResponseEntity create(@RequestBody OtherDTO toCreate) {
        return new ResponseEntity<>(new OtherDTO(1, toCreate.getName()), HttpStatus.CREATED);
    }
}
