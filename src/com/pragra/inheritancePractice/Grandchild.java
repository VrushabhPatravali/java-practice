package com.pragra.inheritancePractice;

public class Grandchild extends Child1 {

    //constructors

    public Grandchild(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    public Grandchild(int a, int b, int c) {
        super(a, b, c);
    }

    public Grandchild(int a, int b) {
        super(a, b);
    }
    public Grandchild(int a) {
        super(a);
    }
    public Grandchild() {
        super();
    }
}
