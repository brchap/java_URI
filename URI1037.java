import java.util.Scanner;
public class URI1037{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        float entrada;

        entrada = teclado.nextFloat();
        
        if(entrada > 25f && entrada <= 50f){
            System.out.println("Intervalo (25,50]");
        }
        else if(entrada >= 0 && entrada <= 25){
            System.out.println("Intervalo [0,25]");
        }
        else if(entrada > 75 && entrada <= 100){
            System.out.println("Intervalo (75,100]");
        }
        else{
            System.out.println("Fora de intervalo");
        }
    }
}