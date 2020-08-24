import java.util.Scanner;
public class URI1074{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int N,X;
        String Par,Positivo;
        N = teclado.nextInt();

        for(int i=0;i<N;i++){
            Positivo = "POSITIVE";
            Par = "ODD";

            X = teclado.nextInt();
            if(X==0){
                System.out.println("NULL");                
            }
            else{
                if((X%2)==0){
                    Par = "EVEN";
                }
                if(X<0){
                    Positivo = "NEGATIVE";
                }
                System.out.println(Par+" "+Positivo);    
            }
        }
    }
}