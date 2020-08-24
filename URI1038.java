import java.util.Scanner;
public class URI1038{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int codigo,qtd;
        float preco = 0f ,total;

        codigo = teclado.nextInt();
        qtd = teclado.nextInt();
        
        if(codigo == 1){
            preco = 4.00f;
        }
        else if(codigo == 2){
            preco = 4.50f;
        }
        else if(codigo == 3){
            preco = 5.00f;
        }
        else if(codigo == 4){
            preco = 2.00f;
        }
        else if(codigo == 5){
            preco = 1.50f;
        }
        
        total = preco * qtd;

        System.out.printf("Total: R$ %.2f\n",total);
    }
}