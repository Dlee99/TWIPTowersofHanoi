package com.company;
import java.util.Scanner;
public class nextMove {
    public static void Move(int n, String A, String B, String C) {
        if(n == 1){
            Move(n - 1, A, C, B);
        }
    }
}