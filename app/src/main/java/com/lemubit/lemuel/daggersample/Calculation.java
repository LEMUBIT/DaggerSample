package com.lemubit.lemuel.daggersample;


public class Calculation {

    private String operation;

    public Calculation(String operation) {
        this.operation = operation;
    }

    public String sum(int a, int b) {
        return "Operation=" + operation + "  Ans=" + (a + b);
    }
}
