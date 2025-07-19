package com.mauricioffdev.calculadora;

import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operacao;
        
        System.out.println("=== Calculadora Console ===");
        System.out.println("Digite dois números e a operação desejada.");
        System.out.println("Operações válidas: +  -  *  /");
        System.out.println("Digite 'sair' como operação para encerrar.");

        while (true) {
            try {
                System.out.print("\nDigite o primeiro número: ");
                double valorUm = input.nextDouble();

                System.out.print("Digite a operação (+, -, *, / ou 'sair'): ");
                operacao = input.next();

                if (operacao.equalsIgnoreCase("sair")) {
                    System.out.println("Encerrando a calculadora. Até logo!");
                    break;
                }

                System.out.print("Digite o segundo número: ");
                double valorDois = input.nextDouble();

                double resultado;

                switch (operacao) {
                    case "+":
                        resultado = valorUm + valorDois;
                        break;
                    case "-":
                        resultado = valorUm - valorDois;
                        break;
                    case "*":
                        resultado = valorUm * valorDois;
                        break;
                    case "/":
                        if (valorDois == 0) {
                            System.out.println("Erro: divisão por zero!");
                            continue;
                        }
                        resultado = valorUm / valorDois;
                        break;
                    default:
                        System.out.println("Operação inválida!");
                        continue;
                }

                System.out.println("Resultado: " + resultado);
            } catch (Exception e) {
                System.out.println("Entrada inválida. Tente novamente.");
                input.nextLine(); // Limpa buffer
            }
        }

        input.close();
    }
}
