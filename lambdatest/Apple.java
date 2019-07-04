package com.bnjsj.lambdatest;

/**
 * Created by bnjsj on 2019/6/11.
 */
public class Apple {
    private String name;
    private String color;
    private int weight;

    public Apple(){}
    public Apple(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
