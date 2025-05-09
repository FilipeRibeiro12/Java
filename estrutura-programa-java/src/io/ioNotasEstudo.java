package io;

import java.util.Scanner;

/*
 * Entrada e Saída (I/O) de dados no Java.
 * 
 * Entrada de dados: Ler dados digitados pelo usuário.
 * Saida de dados: Escrever dados para o usuário.
 */
public class ioNotasEstudo {
  public static void main(String[] args) {
    // Leitura de dados de entrada
    System.out.println("Digite um número inteiro:");
    Scanner scanner = new Scanner(System.in);
    int valorDigitado = scanner.nextInt();
    System.out.println(valorDigitado);
    scanner.close();

    // Saida de dados:
    System.out.printf("O número digitado foi %d", valorDigitado);
  }
}
 