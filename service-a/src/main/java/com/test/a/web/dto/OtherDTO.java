package com.test.a.web.dto;

public class OtherDTO {

    private Integer id;
    private String name;

    private OtherDTO() {
    }

    public OtherDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

