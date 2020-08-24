import java.util.Scanner;
public class URI1041{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        float X,Y;
        String Quad;

        X = teclado.nextFloat();
        Y = teclado.nextFloat();
        
        if(X == 0 && Y == 0){
            Quad = "Origem";
        }
        else if(X == 0){
            Quad = "Eixo X";
        }
        else if(Y == 0){
            Quad = "Eixo Y";
        }
        else if(X > 0){
            if(Y > 0){
                Quad = "Q1";
            }
            else{
                Quad = "Q4";
            }
        }
        else{
            if(Y > 0){
                Quad = "Q2";
            }
            else{
                Quad = "Q3";
            }
        }
        
        System.out.println(Quad);
    }
}