import java.util.Scanner;
public class URI1046{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int Inicio,Fim,Duracao,Dia1,Dia2;

        Inicio = teclado.nextInt();
        Fim = teclado.nextInt();

        if(Inicio == Fim){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else if(Inicio>Fim){
            Dia1 = 24 - Inicio;
            Duracao = Dia1 + Fim;
            System.out.println("O JOGO DUROU "+Duracao+" HORA(S)");
        }
        else{
            Duracao = Fim - Inicio;
            System.out.println("O JOGO DUROU "+Duracao+" HORA(S)");
        }
    }
}