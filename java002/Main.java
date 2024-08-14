
public class Main{

		public static void somar(){
			
			System.out.println(2 + 3);
		}

		public static float multiplicar(){

			return 2f * 4f;
		}

		public static int subtracao(int a , int b){
			return a-b;
		}

	public static void main(String[] args){

		int a = 1;
		float b = 2.0f;
		double c = 3.0f;
		String d = "Ola";
		boolean e = true;

		System.out.println("hello world");
		
		//na programação orientada a objetos, um objeto é uma representaçãode uma entidade do mundo real


		if(a == 1){
			System.out.println("a e igual a 1");
		} else{
			System.out.println("a e diferente de 1");
		}

		//laços de repetição 

		for(int i= 0; i< 10; i++){

			System.out.println(i);
			}


		while(a < 10){
			System.out.println(a);
			a++;
			}

		//ARRAYS
		

		int[] meuArray = new int[10];
			
		meuArray[0] = 999;

		System.out.println(meuArray[0]);

		//FUNÇÕES
		
		System.out.println("Funcoes");


		//Funções sao blocos de instrusões que são executados quando chamadas atraves do Nome() da função

		somar();
		multiplicar();
		System.out.println(multiplicar());
		System.out.println(subtracao(4 , 3));


	}
}
