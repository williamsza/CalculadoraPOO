import java.util.Scanner;
import java.io.*;

public class TestaCalculadoraPOO {
    public static void main(String[] args) throws Exception {

        float numero1, numero2, mostrar;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o primeiro número. ");
        numero1 = teclado.nextFloat();
        System.out.println("Informe o primeiro segundo. ");
        numero2 = teclado.nextFloat();

        Calculadora calcular = new Calculadora();

        // calcular.somar(numero1, numero2);
        System.out.println("A soma de" + calcular.somar(numero1, numero2));

        // calcular.subtrair(numero1, numero2);
        System.out.println("A subtração de" + calcular.subtrair(numero1, numero2));

        // calcular.dividir(numero1, numero2);
        System.out.println("A devisão de" + calcular.dividir(numero1, numero2));

        // calcular.multiplicar(numero1, numero2);
        System.out.println("A multiplicação de" + calcular.multiplicar(numero1, numero2));
    }
}
