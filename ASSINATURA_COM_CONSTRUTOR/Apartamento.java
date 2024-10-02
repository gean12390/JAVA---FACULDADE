public class Apartamento extends Imovel{
      
      public int numeroDeQuartos;
      public int area;
      
      public Apartamento(){
        this.numeroDeQuartos = 2;
      }

      public void Vender(){
        System.out.println("Apartamento " + this.numeroDeQuartos + " quartos vendidos por: " + this.valorVenda);
      }
  }
