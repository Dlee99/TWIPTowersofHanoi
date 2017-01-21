package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many discs would you like to solve for?");
        int discs = sc.nextInt();
        nextMove.Move(discs, "A", "B", "C");
    }
}
