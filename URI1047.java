import java.util.Scanner;
public class URI1047{
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int HoraIni,HoraFim,MinIni,MinFim,HDuracao,MDuracao,DiffH,DiffM,TotalH,TotalM;

        HoraIni = teclado.nextInt();
        MinIni = teclado.nextInt();
        HoraFim = teclado.nextInt();
        MinFim = teclado.nextInt();
        
        if(HoraIni == HoraFim){
            if(MinIni == MinFim){
                HDuracao = 24;
                MDuracao = 0;
            }
            else if(MinIni>MinFim){
                DiffM = 60 - MinIni;
                MDuracao = DiffM + MinFim;
                HDuracao = 23;
            }
            else{
                HDuracao = 0;
                MDuracao = MinFim - MinIni;
            }
            System.out.println("O JOGO DUROU "+HDuracao+" HORA(S) E "+MDuracao+" MINUTO(S)");
        }
        else if(HoraIni>HoraFim){
            DiffH = (24 - HoraIni)*60;
            HDuracao = DiffH + (HoraFim*60);
            if(MinIni>MinFim){
                DiffM = 60 - MinIni;
                MDuracao = DiffM + MinFim;
                HDuracao -= 60;
            }
            else{
                MDuracao = MinFim - MinIni;
            }
            TotalH = (HDuracao+MDuracao)/60;
            TotalM = (HDuracao+MDuracao)%60;
            
            System.out.println("O JOGO DUROU "+TotalH+" HORA(S) E "+TotalM+" MINUTO(S)");
        }
        else{
            HDuracao = HoraFim - HoraIni;
            if(MinIni>MinFim){
                DiffM = 60 - MinIni;
                MDuracao = DiffM + MinFim;
                TotalH = HDuracao - 1;
            }
            else{
                MDuracao = MinFim - MinIni;
                TotalH = HDuracao;
            }
            

            System.out.println("O JOGO DUROU " + TotalH + " HORA(S) E "+ MDuracao +" MINUTO(S)");
        }
    }
}