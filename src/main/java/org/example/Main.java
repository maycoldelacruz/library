package org.example;

import org.example.ejerciciosF.LambdasBasic;
import org.example.ejerciciosF.Messages;
import org.example.ejerciciosN.Sem2.Monday;
import org.example.ejerciciosN.Sem2.Tuesday;
import org.example.ejerciciosN.Sem2.Wednesday;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        //System.out.println(Sem1.SumaIntermedios(8,10));
        //System.out.println("FIBONACCI :"+Monday.fibonacci(10) );
        //Tuesday.streamTestet();
        int result1 = LambdasBasic.lambdaUno(8);
        int result2 = LambdasBasic.lambdaDos(16,2);
        Messages.mayorMenorMessage(result1,result2);
        String t="Fibonacci";
        Wednesday.todoMayus(t);
    }
}