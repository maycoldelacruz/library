package org.example.ejerciciosF;

public class Messages {
    public static void mayorMenorMessage ( int n1, int n2){
        if (n1 > n2) {
            System.out.println("Result1 is greater: " + n1);
            System.out.println("Result2 is smaller: " + n2);
        } else if (n1 < n2) {
            System.out.println("Result2 is greater: " + n1);
            System.out.println("Result1 is smaller: " + n2);
        } else {
            System.out.println("Both results are equal: " + n1);
        }
    }
}
