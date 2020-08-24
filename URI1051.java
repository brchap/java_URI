import java.util.Scanner;
public class URI1051{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        float Salario, Imposto;

        Salario = teclado.nextFloat();
        
        Imposto = 0f;
        
        if(Salario > 2000.00f && Salario <= 3000.00f){
            Imposto = (Salario-2000.00f)*0.08f;
        }
        else if(Salario > 3000.00f && Salario <= 4500.00f){
            Imposto = (1000f*0.08f)+((Salario-3000.00f)*0.18f);
        }
        else if(Salario>4500.00f){
            Imposto = (1000f*0.08f)+(1500.00f*0.18f)+((Salario-4500.00f)*0.28f);
        }

        if(Imposto == 0f){
            System.out.println("Isento");
        }
        else{
            System.out.printf("R$ %.2f",Imposto);
        }
    }
}