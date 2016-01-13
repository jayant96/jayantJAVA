package com.jayant;

/**
 * Created by jayant on 1/5/2016.
 */
public class InnerClass {

    private int i = 50;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    void display()  {
        System.out.println("InnerClass.display");
        System.out.println("i = " + getI());
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.display();
        ActualInnerClass actualInnerClass = innerClass.new ActualInnerClass();
        actualInnerClass.display();
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        staticInnerClass.display();
    }

    public class ActualInnerClass  {
        private int i = 90;


        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public void display()   {
            System.out.println("ActualInnerClass.display");
            System.out.println("i = " + getI());
        }

    }

    static class StaticInnerClass {
        int i;

        void display()  {
            System.out.println("StaticInnerClass.display");
        }
    }



}
