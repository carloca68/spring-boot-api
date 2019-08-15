package com.test.b.web.rest;

public class EntityDTO {
    private Integer id;

    private EntityDTO() {
    }

    public EntityDTO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
