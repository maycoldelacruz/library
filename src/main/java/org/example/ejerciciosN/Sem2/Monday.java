package org.example.ejerciciosN.Sem2;

public class Monday {
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int z = i -1, temp = b;
            b = a + b;
            a = temp;
            z = z-1;
            //System.out.println(z+" "+ b);
        }
        return b;
    }
}
