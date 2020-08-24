import java.util.Scanner;
public class URI1143{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int N, pot;
        

        N = teclado.nextInt();
        
        for(int i=1;i<=N;i++){
            String Linha = "";
            pot = i;
            for(int s=1;s<4;s++){
                Linha += pot;
                
                if(s<3){
                    Linha += " ";   
                }

                pot *= i;
            }
            System.out.println(Linha);
        }
    }
}