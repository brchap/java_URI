import java.util.Scanner;
public class TesteVariaveis{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int A,B,SOMA;

        A = teclado.nextInt();

        B = teclado.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
        
    }
}