import java.util.Scanner;
public class URI1050{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int cod;
        String Cidade;

        cod = teclado.nextInt();
        
        switch (cod) {
            case 11:
                Cidade = "Sao Paulo";
                break;
            case 71:
                Cidade = "Salvador";
                break;
            case 61:
                Cidade = "Brasilia";
                break;
            case 21:
                Cidade = "Rio de Janeiro";
                break;
            case 32:
                Cidade = "Juiz de Fora";
                break;
            case 19:
                Cidade = "Campinas";
                break;
            case 27:
                Cidade = "Vitoria";
                break;
            case 31:
                Cidade = "Belo Horizonte";
                break;             
            default:
                Cidade = "DDD nao cadastrado";
                break;
        }
        

            System.out.println(Cidade);
    }
}