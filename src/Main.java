import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class Main {
    public static void main(String[] args) {
        int numero = 0;
        int fatorial = 1;
        int potencia = 1;
        int operacao;
        int potenciacao;
        int y;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Digite o valor da operação");
            System.out.println("1 - Calcular o fatorial");
            System.out.println("2 - Calcular a potência");
            System.out.println("0 - Programa encerrado");
            operacao = s.nextInt();
            System.out.println("Digite um número");
            numero = s.nextInt();
            if (operacao == 1) {
                fatorial(numero);
            } else if (operacao == 2) {
                int pot = 0;
                System.out.println("Digite o valor da potenciação");
                y = s.nextInt();
                if (y < 1) {
                    System.out.println("Valor inválido");
                }else {
                    numero = potencia(numero, y);
                    System.out.println("O valor da potenciação é " + numero);
                }
            } else {
                System.out.println("Número inválido");
            }
        } while (operacao != 0);
    }

    public static void fatorial(int numero) {
        int fat = 1;
        for (int i = 1; i <= numero; i++) {
            fat *= i;
        }
        System.out.println("O valor do fatorial do número é " + fat);
    }

    public static int potencia(int numero, int potenciacao) {
        int x = 0;
        int resultado = 1;
        for (int i = 0; i < potenciacao; i++) {
            resultado = resultado * numero;
        }
        return resultado;
    }

    }
