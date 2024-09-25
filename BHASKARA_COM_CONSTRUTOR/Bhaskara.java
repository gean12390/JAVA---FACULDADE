import java.util.Scanner;

class Bhaskara {
    public float a;
    public float b;
    public float c;

    public void iniciar(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite Primeiro numero");
        float a = scan.nextFloat();

        System.out.println("Digite Segundo numero");
        float b = scan.nextFloat();

        System.out.println("Digite Terceiro numero");
        float c = scan.nextFloat();

        Bhaskara bhaskara = new Bhaskara();

        bhaskara.calculo(a, b, c);

        scan.close();

    }

    public void calculo(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;

        //CALCULO DELTA
        float delta = (b * b) - (4 * a * c);

        System.out.printf("\na = %.2f, b = %.2f, c = %.2f \n", a, b, c);
        System.out.println("\n Delta = " + delta);

        //CALCULO BHASKARA
        float ln1 = (float)((-b + Math.sqrt(delta)) / (2 * a));
        float ln2 = (float)((-b - Math.sqrt(delta)) / (2 * a));        

        System.out.printf("\n1: %.2f \n2: %.2f\n\n",ln1, ln2);
    }
}
