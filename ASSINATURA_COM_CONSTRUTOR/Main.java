public class Main{
    public static void main(String[]args){
           Apartamento ap = new Apartamento();
           Locador dono = new Locador();
           Locatario turista = new Locatario();
           Imobiliaria imob = new Imobiliaria();
           
           ap.area = 90;

           imob.Alugar(ap);
           ap.valorVenda = 500000.0f;
           ap.Vender();
        }
    }

