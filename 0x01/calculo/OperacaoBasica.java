

public class OperacaoBasica {

	public static double somar(double a, double b) {

		return a + b;
	}

	public static double subtrair(double a, double b) {

		return a - b;
	}

	public static double multiplicar(double a, double b) {

		return a * b;
	}

	public static double dividir(double a, double b) {

		return a / b;
	}
	
	public static double sqrt(double a) {
		return Math.sqrt(a);
	}
	
	public static String numero_primo(int a) {
		
		if(a <= 1) {
			return "Número invalido. Numero menor ou igual a 1 não é primo";
		}
		else if(a % a == 0) {
			return "Numero válido, o numero é primo";	
		}
		else {
			return "Número válido, mas o numero não é primo";	
		}
		
	}

}
