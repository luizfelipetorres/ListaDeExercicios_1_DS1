package ex4;

import java.util.Scanner;

public class Ex4 {
    private double vCompra;
    private double pDesconto;

    public Ex4(Scanner s) {
        System.out.printf("\nDigite o valor da compra: ");
        vCompra = s.nextFloat();
        System.out.printf("\nDigite o percentual de desconto: ");
        pDesconto = s.nextFloat();
    }

    private double valorFinal() {
        return vCompra - (vCompra * pDesconto);
    }

    @Override
    public String toString() {
        return new String().format("O valor R$ %.2f com %.2f de desconto é de R$ %.2f",
                vCompra, pDesconto, valorFinal());

    }
}
