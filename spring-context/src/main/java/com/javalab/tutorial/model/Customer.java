package com.javalab.tutorial.model;

public class Customer {
    private String name;
    private String family;
    private Integer age;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
