import java.util.Scanner;
public class URI2787{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int L,C,Cor;

        L = teclado.nextInt();

        while(L < 1 || L > 1000){
            L = teclado.nextInt();
        }

        C = teclado.nextInt();

        while(L < 1 || L > 1000){
            C = teclado.nextInt();
        }
        
        if(L == C){
            Cor = 1;
        }
        else if(L < C){
            int cont = 1;
            for(int i = L; i < C; i++){
                cont++;
            }
            Cor = cont % 2;
        }
        else{
            int cont = 1;
            for(int i = C; i < L; i++){
                cont++;
            }
            Cor = cont % 2;
        }

        System.out.println(Cor);
    }
}