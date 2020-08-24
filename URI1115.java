import java.util.Scanner;
public class URI1115{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int X,Y;
        String Q;
        
        do{
            X = teclado.nextInt();
            Y = teclado.nextInt();

            if(X != 0 && Y != 0){

                if(X < 0){
                    if(Y < 0){
                        Q = "terceiro";
                    }
                    else{
                        Q = "segundo";
                    }
                }
                else{
                    if(Y < 0){
                        Q = "quarto";
                    }
                    else{
                        Q = "primeiro";
                    }
                }

            
                System.out.println(Q);
            }
        }
        while(X != 0 && Y != 0);
    }
}