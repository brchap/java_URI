import java.util.Scanner;
public class URI1012{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        double A,B,C;
        double pi = 3.14159;
        double ATriang, ACirc, ATrap, AQuad, ARet;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        
        ATriang = (A*C)/2;
        ACirc = pi*C*C;
        ATrap = ((A+B)/2)*C;
        AQuad = B*B;
        ARet = A*B;

        System.out.printf("TRIANGULO: %.3f\n", ATriang);
        System.out.printf("CIRCULO: %.3f\n",ACirc);
        System.out.printf("TRAPEZIO: %.3f\n",ATrap);
        System.out.printf("QUADRADO: %.3f\n",AQuad);
        System.out.printf("RETANGULO: %.3f\n",ARet);
        
    }
}