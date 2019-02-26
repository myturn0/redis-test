package com.apollo.bean;

/**
 * @author ：apollo
 * @since ：Created in 2019/2/22
 */
public class Animal {
    private Integer weight;
    private Integer height;
    private String name;

    public Animal(Integer weight, Integer height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
