import java.util.Scanner;
public class URI1114{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int Senha;
        Boolean Match = false;
        
        do{
            Senha = teclado.nextInt();

            if(Senha == 2002){
                Match = true;
            }
            else{
                System.out.println("Senha Invalida");
            }
            
        }
        while(Match!=true);

        System.out.println("Acesso Permitido");
        
    }
}