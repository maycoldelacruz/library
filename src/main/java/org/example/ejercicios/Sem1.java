package org.example.ejercicios;

public class Sem1 {
    private int numero1, numero2;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int Suma(){
        return numero1+numero2;
    }
    public static int SumaIntermedios(int num1, int num2){
        int menor = Math.min(num1,num2);
        int mayor = Math.max(num1,num2);

        int suma = 0;
        for (int i = menor; i <= mayor; i++) {
            suma += i;
        }

        return suma;
    }
}
