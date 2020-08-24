import java.util.Scanner;
public class URI1005{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        float A,B;
        double MEDIA;

        A = teclado.nextFloat();

        B = teclado.nextFloat();

        MEDIA = (A*3.5f + B*7.5f)/11;

        System.out.println("MEDIA = %.5f\n", MEDIA);
        
    }
}