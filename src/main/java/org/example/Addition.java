package org.example;

public class Addition {

    public static void main(String[] args){
        int a= 10;
        int b= 20;
        Addition addObj= new Addition();
        addObj.sum( a, b);
    }

     void sum(int a, int b) {
        int c=a+b;
        System.out.println("The sum of a and b is: " + c);
    }

}
