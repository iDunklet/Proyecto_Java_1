import java.util.Scanner;

package jogodavelha;

public class jogodavelha {

    public static void main(String[] args) {
        Campo[][] velha=new Campo[3][3];
        char simboloAtual='X';
        boolean game=true;
        String vitoria="";
        Scanner scan=new Scanner(System.in);
        while(game){
            desenhaJogo(velha);
            vitoria=verificaVitoria(velha);
            if(!vitoria.equals("")){
                System.out.printf("Jogador %s venceu%n",vitoria);
                break;
            }
            try{


            }catch(Exception e){
                System.out .printf("Erro")
            }
        }
        System.out.printf("fim de jogo")
    }
    public static void desenhaJogo(Campo[][] velha){
        limparTela();
        System.out.printf("     0     1   2")
        System.out.printf("0  %c  |  %c  |  %c %n",velha[0][0].getSimbolo(),velha[0][1].getSimbolo(),velha[0][2].getSimbolo());
        System.out.println("   ----------------");
        System.out.printf("1  %c  |  %c  |  %c %n",velha[1][0].getSimbolo(),velha[1][1].getSimbolo(),velha[1][2].getSimbolo());
        System.out.println("   ----------------");
        System.out.printf("2  %c  |  %c  |  %c %n",velha[2][0].getSimbolo(),velha[2][1].getSimbolo(),velha[2][2].getSimbolo());
    
    }
    public static void limparTela(){
        for(int cont=0;cont<200;cont++){
            System.out.println("")

        }
    }

    public void Boolean verificarJogada(Campos[][] velha,int p[],char simboloAtual){
        if(velha[p[0]][p[1]])
    }

    public static String verificaVitoria(Campo[][] velha){
        return "";
    }

}
