import java.util.Scanner;
public class URI1064{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int CountPositivo = 0;
        float soma = 0.0f, media = 0.0f;

        for(int i=0;i<6;i++){
            float Entrada;
            Entrada = teclado.nextFloat();

            if(Entrada > 0){
                CountPositivo++;
                soma += Entrada;
            }
        }

        media = soma /CountPositivo;

        System.out.println(CountPositivo + " valores positivos");
        System.out.printf("%.1f",media);
    }
}