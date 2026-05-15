package tratamentoerro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoErro {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        char opcao;

        do {
            try {
                
                System.out.println("digite o numerador");
                int numerador = ler.nextInt();

                System.out.println("digite o denominador:");
                int denominador = ler.nextInt();

                int resultado = numerador / denominador;
                System.out.println("resultado da divisao: " + resultado);

                System.out.println("digite o tamanho do vetor:");
                int tamanho = ler.nextInt();

                int[] vetor = new int[tamanho];

                for (int i = 0; i < tamanho; i++) {
                    System.out.print("digite o valor da posicao " + i + ": ");
                    vetor[i] = ler.nextInt();
                }
               
                
                System.out.print("digite um indice: ");
                int indice = ler.nextInt();

                System.out.println("posicao:" + vetor[indice]);
            } catch (ArithmeticException e) {
                System.out.println("divisao por zero nao e permitida.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("fora do limite do vetor.");
            } catch (InputMismatchException e) {
                System.out.println("digite apenas numeros.");
                ler.nextLine(); 
            } catch (Exception e) {
                System.out.println("erro inesperado: " + e.getMessage());
            } finally {
                System.out.print("Deseja repetir o programa? (s/n): ");
                opcao = ler.next().charAt(0);
                ler.nextLine(); 
            }
        } while (opcao == 's');
        System.out.println("programa encerrado.");
        ler.close();
    }
}