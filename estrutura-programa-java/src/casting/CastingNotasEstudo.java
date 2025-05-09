package casting;

/*
 * Casting: Operação de transformar um tipo de dados em outro.
 * 
 * Widening Casting vs Narrowing Casting
 */

public class CastingNotasEstudo {
  public static void main(String[] args) {
    // Windening Casting (Implicíto)
    byte variavelPequena = 1;
    int variavelGrande = variavelPequena;

    short variavelShort = 10;
    int variavelInt = variavelShort;

    // System.out.println(variavelGrande);
    // System.out.println(variavelInt);

    // Narrowing Casting (Explícito)
    long variavelLong = 65467;
    int variavelInti = (int) variavelLong;
    // System.out.println(variavelInti);

    // Operações de divisão entre numeros inteiros
    int numero1 = 9;
    int numero2 = 2;
    float resultadoDivisao = (float) numero1 / numero2;
    System.out.println(resultadoDivisao);
  }
}
