package com.game.epi.primitives;

// Program to calculate number of bits in a number
public class NumberOfBits{
    public static void main(String args[]){
        int bits = numBits(7);
        System.out.println("Number of bits "+bits);
    }
    public static int numBits(int number){
        int bits = 0;
        while(number !=0){
            bits += (number & 1);
            number >>>=1;
        }
        return bits;
    }
}

