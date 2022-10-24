package com.devsuperior.bds01.dto;

import com.devsuperior.bds01.entities.Department;

import java.io.Serializable;

public class DepartmentDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public Long id;
    public  String name;

    public DepartmentDTO() {
    }

    public DepartmentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartmentDTO(Department department) {
        id = department.getId();
        name = department.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
