package string;

import java.util.Scanner;

/*
 * String é um tipo de referencia que apresenta uma cadeia de caracteres.
 */

public class StringNotasEstudo {
  public static void main(String[] args) {
    String texto = "Um texto para ser impresso";
    System.out.println(texto);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual é o seu nome ?");
    String nome = scanner.nextLine();
    System.out.printf("Olá %s",nome);

    scanner.close();
  }
}
