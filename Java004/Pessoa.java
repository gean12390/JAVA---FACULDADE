public class Pessoa{
    
    //VARIAVEIS 
    public  int idade; 
    public  String nome;
    public  int cpf;

    //construtor    
    public Pessoa(int i, String n, int c){
        this.idade = i; //vai pegar a classe idade do outro arquivo e vai colocar entro da variavel "i"
        this.nome = n;
        this.cpf = c;
    }
}
