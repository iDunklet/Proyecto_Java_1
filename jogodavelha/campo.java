package jogodavelha;

public class campo {
    private char simbolo;
    public campo(){
        this.simbolo =' ';
    }
    public char getSimbolo(){
        return this.simbolo;
    }
    public void setSimbolo(char simbolo){
        if(this.simbolo == ' '){
            this.simbolo = simbolo;
        }else{
            System.out.print("Campo ja")
        }
    }
}