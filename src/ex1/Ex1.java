package ex1;

import java.util.Scanner;

/**
 * A partir de dois números decimais e efetuar as quatros operações matemáticas básicas,
 * apresentando ao final os resultados obtidos
 */
public class Ex1 {
    private double n1;
    private double n2;

    public Ex1(double n1, double n2) {
        super();
        this.n1 = n1;
        this.n2 = n2;
    }

    public Ex1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        this.n1 = s.nextInt();
        System.out.println("Digite o segundo número: ");
        this.n2 = s.nextInt();
    }

    public double sum() {
        return this.getN1() + this.getN2();
    }

    public double subtract() {
        return this.getN1() - this.getN2();
    }

    public double divide() {
        return this.getN1() / this.getN2();
    }

    public double multiply() {
        return this.getN1() * this.getN2();
    }

    @Override
    public String toString() {
        return "Soma: " + this.sum() +
                "\nSubtração: " + this.subtract() +
                "\nDivisão: " + this.divide() +
                "\nMultiplicação: " + this.multiply();

    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }
}
