package com.xj731231.testspring.entity;

import lombok.Data;

/**
 * Description:
 * Author: jie.xu
 * Date: 2024/07/23 20:05
 */

@Data
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}