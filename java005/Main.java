public class Main {
	public static void main(String[] args) {

		Carro carrera = new Carro();

		carrera.marca = "Porsche";
		carrera.cor = "Azul";
		carrera.ano = 2024;
		carrera.setPreco( 2000000f) ;

		System.out.println(carrera.quantidadedeRodas);
		carrera.frear();
		carrera.acelerar(60f);
		carrera.ligar(false);
		System.out.println("Seu carro custa: " + carrera.getPreco());
	}
}
/*
 * PUBLIC = qualquer classe pode acessar.
 * PROTECTED = apenas a propria classe e filhas.
 * PRIVATE = apenas a propria classe.
 */
