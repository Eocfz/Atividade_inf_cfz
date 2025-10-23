package Java;

public class questao09 {
    public static void main(String[] args) {
        int nota1 = 9;
        double nota2 = 9.5;
        double nota3 = 8.5;

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media das tres notas e: " + media);
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

    }
}
