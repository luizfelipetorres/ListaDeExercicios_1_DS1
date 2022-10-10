package ex2;

import java.util.Scanner;

/**
 * 2.1 Calcular e exibir a potência de cada um deles com expoente 5.
 * 2.2 Calcular e exibir a divisão entre os inteiros guardando em uma variável int.
 */
public class Ex2 {
    private int n1;
    private int n2;
    private int divisionResult;

    public Ex2(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Ex2(Scanner s) {
        System.out.printf("\nDigite o primeiro numero: ");
        n1 = s.nextInt();
        System.out.printf("\nDigite o segundo número: ");
        n2 = s.nextInt();
    }

    private double pow(int n) {
        return Math.pow(n, 5);
    }

    private double sqrt(int n){
        return Math.sqrt(n);
    }

    public int getDivisionResult() {
        divisionResult = n1 / n2;
        return divisionResult;
    }

    public float getModule(){
        return n1 % (float) n2;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(n1 + "^5 = " + pow(n1) + "\n");
        sb.append(n2 + "^5 = " + pow(n2));
        sb.append("\n" + n1 + " / " + n2 + " = " + getDivisionResult());
        sb.append("\n" + n1 + " % " + n2 + " = " + getModule());
        sb.append("\n" + n1 + " raiz 2 " + " = " + sqrt(n1));
        sb.append("\n" + n2 + " raiz 2 " + " = " + sqrt(n2));

        return sb.toString();
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }
}
