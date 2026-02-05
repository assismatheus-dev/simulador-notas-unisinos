import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class CalculadoraDeNotas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int escolhaUsuario = -1;

        while (escolhaUsuario != 0) {
            try {
                System.out.println("\n--------CÁLCULO DE MÉDIA--------");
                System.out.print("INSIRA A SUA NOTA DO GRAU A: ");
                double GA = sc.nextDouble();

                System.out.print("INSIRA A SUA NOTA DO GRAU B (Caso queira apenas saber a nota necessária no Grau B, insira 0): ");
                double GB = sc.nextDouble();

                double mediaFinal = grauFinal(GA, GB);

                System.out.println("\n--- RESULTADOS ---");
                System.out.println("Nota do Grau A: " + String.format("%.1f", grauAFinal(GA)) + " | " + (int)(GA * 10) + "% de 100%");
                System.out.println("Nota do Grau B: " + String.format("%.1f", grauBFinal(GB)) + " | " + (int)(GB * 10) + "% de 100%");
                System.out.println("Nota Final: " + String.format("%.1f", mediaFinal) + " | " + (int)(mediaFinal * 10) + "% de 100%");

                if (mediaFinal >= 6.0) {
                    System.out.println("\nSTATUS: APROVADO! Parabéns.");
                    System.out.println("-> Nota mínima no GB para evitar Grau C era de: " + String.format("%.1f", grauBMinimo(GA)));

                } else if(GB == 0) {
                    System.out.println("\n-> Nota mínima no GB para evitar Grau C: " + String.format("%.1f", grauBMinimo(GA)));
                } else {
                    System.out.println("\nSTATUS: GRAU C. Você precisa recuperar a nota.");
                    System.out.println("-> Nota mínima no GB para evitar Grau C: " + String.format("%.1f", grauBMinimo(GA)));
                }

                System.out.println("\nDigite [0] para encerrar ou qualquer outro número para novo cálculo: ");
                escolhaUsuario = sc.nextInt();

            } catch (InputMismatchException e) {
                System.err.println("ERRO: Entrada inválida! Por favor, use números e ponto (ex: 7.5).");
                sc.nextLine(); // LIMPEZA DE BUFFER: Essencial para não travar o loop
            }
        }

        System.out.println("Programa encerrado. Bons estudos na Unisinos!");
        sc.close();
    }

    public static double grauFinal(double GA, double GB) {
        return (GA * 0.33 + GB * 0.67);
    }

    public static double grauAFinal(double GA) {
        return GA * 0.33;
    }

    public static double grauBFinal(double GB) {
        return GB * 0.67;
    }

    public static double grauBMinimo(double GA) {
        return (6.0 - (GA *  0.33)) / 0.67;
    }
}