package Java;

import java.util.Scanner;

public class atv2quest03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quanto voce recebe por hora trabalhada: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Digite o numero de horas trabalhadas no mes: ");
        double horasTrabalhadas = scanner.nextDouble();
        double salarioMensal = valorHora * horasTrabalhadas;
        System.out.println("Seu salario mensal e: R$ " + salarioMensal);
        scanner.close();
    }
}
