package com.jayant;

public class Main {

    public static void main(String[] args)  {
        InnerClass innerClass = new InnerClass();
        innerClass.display();
        InnerClass.ActualInnerClass actualInnerClass = innerClass.new ActualInnerClass();
        actualInnerClass.display();
        InnerClass.StaticInnerClass staticInnerClass = new InnerClass.StaticInnerClass();
        staticInnerClass.display();


    }
}
