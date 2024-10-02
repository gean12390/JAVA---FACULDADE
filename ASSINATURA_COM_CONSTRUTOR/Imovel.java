public class Imovel{
      public float valorAluguelMensal;
      public float valorAluguelDiario;
      public float valorVenda;
      public boolean estaAlugado = false;

      public void Vender(){
        System.out.println("Imovel vendido por: " + this.valorVenda);
      }
  }