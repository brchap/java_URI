import java.util.Scanner;
public class URI1065{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int CountPar = 0;

        for(int i=0;i<5;i++){
            int Entrada;
            Entrada = teclado.nextInt();

            if((Entrada%2)==0){
                CountPar++;
            }
        }

        System.out.println(CountPar + " valores pares");
    }
}