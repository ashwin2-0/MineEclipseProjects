package com.practise.any;

abstract class AbstractClass {
    // Abstract method
    abstract void abstractMethod();

    // Constructor
    public AbstractClass() {
        // Initialization code
    }
}

class ConcreteCl extends AbstractClass {
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented");
    }
}

public class ConcreteClass {
    public static void main(String[] args) {
    	ConcreteCl obj = new ConcreteCl();
        obj.abstractMethod();
    }
}