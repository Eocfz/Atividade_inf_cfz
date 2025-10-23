package Java;

import java.util.Scanner;

public class atv2quest04 {
    public static void main(String[] args) {
     Scanner nScanner = new Scanner(System.in);
        System.out.println("Digite a o valor recebido por hora trabalhada: ");
        double valorHora = nScanner.nextDouble();
        System.out.println("Digite o numero de horas trabalhadas no mes: ");
        double horasTrabalhadas = nScanner.nextDouble();
        double salarioMensal = valorHora * horasTrabalhadas;
        nScanner.close();
        System.out.println("Seu salario mensal e: R$ " + salarioMensal);
        System.out.println("com o desconto do INSS (10%) e: R$ " + (salarioMensal - (salarioMensal * 0.10)));
        System.out.println("Desconto do Sindicato (5%): R$ " + (salarioMensal * 0.03));
        System.out.println("Salario bruto: R$ " + salarioMensal);
        System.out.println("Quanto pagou de INSS: R$ " + (salarioMensal * 0.10));
        System.out.println("Salario liquido: R$ " + (salarioMensal - (salarioMensal * 0.10) - (salarioMensal * 0.03)));
    }
}
