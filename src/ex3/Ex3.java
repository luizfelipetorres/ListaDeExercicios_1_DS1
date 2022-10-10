package ex3;

import java.util.Scanner;

public class Ex3 {
    private int n1;
    private int n2;

    public Ex3(Scanner s){
        System.out.printf("\nDigite o primeiro numero: ");
        n1 = s.nextInt();
        System.out.printf("\nDigite o segundo número: ");
        n2 = s.nextInt();
        this.swap();
    }
    private void swap(){
        n1 = n2 - n1;
        n2 = n2 - n1;
        n1 = n1 + n2;
    }

    @Override
    public String toString() {
        return new StringBuilder("n1 = " + n1 + "\nn2 = " + n2).toString();
    }
}
