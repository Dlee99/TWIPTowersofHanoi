package com.company;

public class nextMove {
    public static void Move(int n, String T1, String T2, String T3) {
        if(n == 1){
            System.out.println("Move from " + T1 + " to " + T3);
        }
        else{
            Move(n - 1, T1, T3, T2);
            System.out.println("Move from " + T1 + " to " + T3);
            Move(n - 1, T2, T1, T3);
        }
    }
}