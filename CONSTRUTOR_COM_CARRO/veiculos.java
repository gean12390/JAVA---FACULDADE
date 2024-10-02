public class veiculos {
    public int quantidadedeRodas;
    public String marca;
    public String cor;
    public int ano;
    private float preco;
    public boolean estaLigado = false;

    // CONSTRUTOR
    
    public float getPreco(){
        return this.preco;
    }
    public void setPreco(float prc){
       this.preco = prc;
    }
    
    

    public void ligar(boolean lig) {
        if (lig && !estaLigado) {
            System.out.println("ligado");
            estaLigado = true;
        } else {
            System.out.println("Desligado");
            estaLigado = false;
        }
    }

    public void acelerar(float vel) {
        if (estaLigado) {
            System.out.println("Velocidade: " + vel);
        } else {
            System.out.println("Ligue o veiculo antes");

        }
    }

    public void frear() {
        System.out.println("parado");
    }

    public void vender() {
        System.out.println("Vendido por: " + preco);
    }
}
