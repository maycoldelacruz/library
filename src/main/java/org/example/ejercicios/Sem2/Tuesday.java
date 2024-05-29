package org.example.ejercicios.Sem2;

import java.util.stream.IntStream;

public class Tuesday {
    public static void streamTestet(){
        IntStream
                .range(0, 150)
                .map(x -> x*x)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }

}
