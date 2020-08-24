import java.util.Scanner;
public class URI1073{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int N,Quad;
        N = teclado.nextInt();

        for(int i=1;i<=N;i++){
            if((i%2)==0){
                Quad=i*i;
                System.out.println(i+"^2 = "+Quad);
            }
        }
    }
}