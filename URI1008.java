import java.util.Scanner;
public class URI1008{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int FuncNum,HorasTrab;
        float ValorHora,Salario;

        FuncNum = teclado.nextInt();
        HorasTrab = teclado.nextInt();
        ValorHora = teclado.nextFloat();
        
        Salario = HorasTrab*ValorHora;

        System.out.println("NUMBER = " + FuncNum);
        System.out.printf("SALARY = U$ %.2f\n",Salario);
        
    }
}