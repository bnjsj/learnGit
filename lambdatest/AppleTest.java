package com.bnjsj.lambdatest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bnjsj on 2019/6/11.
 */
public class AppleTest {
    public static void main(String[] args) {
        AppleTest appleTest = new AppleTest();
        ArrayList<Apple> source = new ArrayList<>();
        source.add(new Apple("a","red",10));
        source.add(new Apple("b","green",12));
        source.add(new Apple("c","blue",14));
        source.add(new Apple("d","red",16));
        source.add(new Apple("e","red",18));
        source.add(new Apple("f","green",20));
        source.add(new Apple("g","green",22));
        source.add(new Apple("h","red",24));
        source.add(new Apple("i","orangle",26));
        source.add(new Apple("j","red",28));
        source.add(new Apple("k","red",30));


        PreFilter<Apple> p =(Apple apple) -> "red".equals(apple.getColor()) && 20 <apple.getWeight();
        //(Apple apple) -> "red".equals(apple.getColor()) && 20 <apple.getWeight()
        List<Apple> filter = filter(source, p);
        for (Apple a : filter) {
            System.out.println(a.getName()+"-"+a.getColor()+"-"+a.getWeight());
        }
    }

    private  static <T> List<T> filter(List<T> list, PreFilter<T> p){
        ArrayList<T> result = new ArrayList<>();

        for(T e: list){
            if(p.test(e)){
                result.add(e);
            }
        }
        return result;
    }
}
