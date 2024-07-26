package com.xj731231.testspring.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Description:
 * Author: jie.xu
 * Date: 2024/07/23 20:15
 */

@Data
public class Taco {

    private Long id;

    private Date createdAt;

    @NotNull(message = "Taco name cannot be null")
    @Size(min = 5, message = "Taco name must be at least 5 characters long")
    private String name;

    @NotNull(message = "Ingredient cannot be null")
    private List<Ingredient> ingredients;
}
