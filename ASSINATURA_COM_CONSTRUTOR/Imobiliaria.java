public class Imobiliaria{
      public String nome;
      public int cnpj;

      public Imobiliaria(){
        nome = "";
        cnpj = 0;
      }
      public void Alugar(){
        System.out.println("Imovel Alugado");
      }

      public void Alugar(Apartamento a){
        System.out.println("Alugado o apartamento com "+ a.area + " metros quadrados");
      }
  }