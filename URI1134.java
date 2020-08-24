import java.util.Scanner;
public class URI1134{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int Cod;
        int Alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;
        Boolean Fim = false;
        
        do{
            Cod = teclado.nextInt();

            switch (Cod) {
                case 1:
                    Alcool++;
                    break;
                case 2:
                    Gasolina++;
                    break;
                case 3:
                    Diesel++;
                    break;
                case 4:
                    Fim = true;
                    System.out.println("MUITO OBRIGADO");
                    System.out.println("Alcool: "+Alcool);
                    System.out.println("Gasolina: "+Gasolina);
                    System.out.println("Diesel: "+Diesel);
                    break;            
                default:
                    break;
            }
        }
        while(Fim!=true);
    }
}