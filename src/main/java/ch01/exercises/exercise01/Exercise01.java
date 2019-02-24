// 1. Write a program that reads an integer and prints it in binary, octal, and hexadecimal.
// Print the reciprocal as a hexadecimal floating-point number.

package ch01.exercises.exercise01;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int intValue = in.nextInt();

        System.out.println("Binary: " + Integer.toBinaryString(intValue));
        System.out.printf("Octal: %o\n", intValue);
        System.out.printf("Hexadecimal: %x\n", intValue);

        double reciprocal = 1.0 / intValue;
        System.out.printf("Hexadecimal floating point: %a\n", reciprocal);

    }
}
