package org.example;

public class Apdex {

    private int s;
    private int t;
    private int f;
    private int a;


    public Apdex(){}

    public double calculaApdex(int s, int t, int a){
        return (s + (t / 2.0)) / a;
    }


    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
