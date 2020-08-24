import java.util.Scanner;
public class URI1070{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int Entrada;
        Entrada = teclado.nextInt();

        int countImpar = 0;
        for(int i=Entrada;countImpar<6;i++){
            if((i%2)!=0){
                countImpar++;
                System.out.println(i);
            }
        }
    }
}