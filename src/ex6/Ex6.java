package ex6;

import java.util.Scanner;

public class Ex6 {
    private float tempC;

    public Ex6(Scanner s) {
        System.out.printf("Digite a temperatura em Celsius: ");
        this.tempC = s.nextFloat();
    }

    private float tempF(){
        return (9 * tempC + 160) / 5;
    }

    @Override
    public String toString() {
        return String.format("%.2f graus Celsius equivale a %.2f fahrenheit", tempC, tempF());
    }
}
