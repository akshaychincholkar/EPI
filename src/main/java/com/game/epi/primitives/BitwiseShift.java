package com.game.epi.primitives;

public class BitwiseShift {
    public static void main(String args[]){
        int a = -2;
        // adds 1 to the start of the 32 bit int in java 2's complement
        System.out.println("a>>1: "+(a>>1));

        int a2 = 2;
        // adds 0 to the start of the 32 bit int in java
        System.out.println("a>>1: "+(a2>>1));

        int b = -2;
        // adds 0 to the start of the 32 bit int in java
        System.out.println("b>>>1: "+(b>>>1));

        int b2 = 2;
        // adds 0 to the start of the 32 bit int in java irrespective of sign
        System.out.println("b>>>1:"+(b2>>>1));
    }
}