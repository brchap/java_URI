import java.util.Scanner;
public class URI1043{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        float A,B,C,Perimetro,Area;

        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();
        
        if(A+B>C && C+A>B && B+C>A){
            Perimetro = A+B+C;
            System.out.printf("Perimetro = %.1f\n",Perimetro);
        }
        else {
            Area = ((A+B)*C)/2f;
            System.out.printf("Area = %.1f\n",Area);
        }
    }
}