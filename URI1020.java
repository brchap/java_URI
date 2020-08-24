import java.util.Scanner;
public class URI1020{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int dias,meses,anos,entrada,resto;

        entrada = teclado.nextInt();
        
        /*
        jeito burro
        
        anos = entrada/365;
        meses = (entrada-anos*365)/30;
        dias = ((entrada-anos*365) - meses * 30 );
        */

        anos = entrada / 365;
        resto = entrada % 365;

        meses = resto / 30;
        dias = resto % 30;
        
        


        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

    }
}