package org.example.ejerciciosF;

import java.util.Comparator;
import java.util.function.Function;

public class LambdasBasic {
    public static int lambdaUno(int n){

        Function<Integer, Integer> square = x -> x * x;

        int result = square.apply(n);

        System.out.println(result);
        return result;
    }
    public static int lambdaDos(int n1, int n2){

        Function<Integer, Integer> square = x -> x * x;

        int result = square.apply(n1/n2);
        System.out.println(result);
        return result;
    }
    /*public static void compararNumeros(int a, int b){
        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        System.out.println(comparator);
    }*/


}
