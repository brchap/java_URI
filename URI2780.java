import java.util.Scanner;
public class URI2780{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int Distancia, Pontuacao = 0;
        Distancia = teclado.nextInt();

        while(Distancia < 0 || Distancia > 2000){
            Distancia = teclado.nextInt();
        }
        
        if(Distancia >= 0 && Distancia <= 800){
            Pontuacao = 1;
        }
        else if(Distancia > 800 && Distancia <= 1400){
            Pontuacao = 2;
        }
        else if(Distancia > 1400 && Distancia <= 2000){
            Pontuacao = 3;
        }

        System.out.println(Pontuacao);
    }
}