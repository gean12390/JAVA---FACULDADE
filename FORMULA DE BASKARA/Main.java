
// EXERCÍCIO:
      /*
      Faça um programa em java que calcule 
      as raízes de uma equação de segundo
      grau utilizando o método de Bhaskara.
      */



public class Main{

	public static void main(String[] args){
		float a = 1;
		float b = 5;
		float c = 2;
		float delta;
		double delta_calc;
      		double x1;
      		double x2;
	
		System.out.println("equacao: 1*5*2 = 0");

		//DELTA
		
		//b² .4-a.c

		delta =(b*b)-4*a*c;
		
		System.out.println("calculo Delta: 5² -4.1.2");		

		System.out.printf("Delta = %f", delta);

		delta_calc = Math.sqrt(delta);

		//(-b ± √Δ)/2

		System.out.println("\nFormula de Baskara: (-b ± √Delta)/2");
		
		x1 = (-b + delta_calc)/2;
		x2 = (-b - delta_calc)/2;

		System.out.printf("X1 = %fl / X2 = %fl" , x1 , x2);

	}
}
