package org.example;

public class Addition {

    public static void main(String[] args){
        int a= 10;
        int b= 20;
        int c=2;
        Addition addObj= new Addition();
        addObj.sum( a, b,c);
    }

     void sum(int a, int b, int c) {
        int d=a+b+c;
        System.out.println("The sum of a and b and c is: " + d);
    }

}
