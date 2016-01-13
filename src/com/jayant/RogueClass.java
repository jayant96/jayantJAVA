package com.jayant;

/**
 * Created by jayan on 1/5/2016.
 */
public class RogueClass {

    int i;

    static void method()    {
        RogueClass c = new RogueClass();
        System.out.println(c.i);
    }

    public static void main(String[] args) {
        RogueClass.method();
    }

}
