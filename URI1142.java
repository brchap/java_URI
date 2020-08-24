import java.util.Scanner;
public class URI1142{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int N, count = 1;
        

        N = teclado.nextInt();
        
        for(int i=0;i<N;i++){
            String Linha = "";
            for(int s=1;s<=4;s++){
                if(s!=4){
                    Linha += count + " ";
                }
                else{
                    Linha += "PUM";
                }
                count++;
            }
            System.out.println(Linha);
        }
    }
}