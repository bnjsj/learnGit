package com.bnjsj.lambdatest;

/**
 * Created by bnjsj on 2019/6/11.
 */
public interface PreFilter<T> {
    boolean test(T t);
}
