import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] notas = new double[8];
        
        System.out.println("Digite as 8 notas anuais:");
        for (int i = 0; i < 8; i++) {
            System.out.printf("Nota %d: ", i + 1);
            notas[i] = scanner.nextDouble();
        }
        
        // Médias bimestrais (já são as notas individuais, mas vamos só mostrar)
        double bimestre1 = notas[0];
        double bimestre2 = notas[1];
        double bimestre3 = notas[2];
        double bimestre4 = notas[3];
        double bimestre5 = notas[4];
        double bimestre6 = notas[5];
        double bimestre7 = notas[6];
        double bimestre8 = notas[7];
        
        // Médias semestrais (4 notas por semestre)
        double semestre1 = (bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4;
        double semestre2 = (bimestre5 + bimestre6 + bimestre7 + bimestre8) / 4;
        
        // Média final (média dos dois semestres)
        double mediaFinal = (semestre1 + semestre2) / 2;
        
        // Exibindo os resultados
        System.out.println("\nPráticas");
        System.out.printf("1o Bimestre: %.1f\n", bimestre1);
        System.out.printf("2o Bimestre: %.1f\n", bimestre2);
        System.out.printf("3o Bimestre: %.1f\n", bimestre3);
        System.out.printf("4o Bimestre: %.1f\n", bimestre4);
        System.out.printf("1o Semestre: %.1f\n", semestre1);
        System.out.println("----------------------");
        System.out.printf("5o Bimestre: %.1f\n", bimestre5);
        System.out.printf("6o Bimestre: %.1f\n", bimestre6);
        System.out.printf("7o Bimestre: %.1f\n", bimestre7);
        System.out.printf("8o Bimestre: %.1f\n", bimestre8);
        System.out.printf("2o Semestre: %.1f\n", semestre2);
        System.out.println("-----------------------");
        System.out.printf("Média Final: %.1f\n", mediaFinal);
        
        scanner.close();
    }
}
