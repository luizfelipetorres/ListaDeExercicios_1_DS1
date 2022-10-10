package ex5;

import java.util.Scanner;

public class Ex5 {
    private double cotacao;
    private double dolar;
    public Ex5(Scanner s){
        System.out.printf("Quantos dolares vc tem na carteira? ");
        dolar = s.nextFloat();
        System.out.printf("Qual é o valor do dólar hoje? ");
        cotacao = s.nextFloat();
    }

    public double real(){
        return dolar * cotacao;
    }

    @Override
    public String toString() {
        return String.format("US$ %.2f equivale a R$ %.2f", dolar, real());
    }
}
