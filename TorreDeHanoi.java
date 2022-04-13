import java.util.Scanner;

public class TorreDeHanoi {
	public static void main(String[] args) {
		// Declaração de variáveis
		int numero = 0;

		// Entrada de dados
		numero = lerNumeroDoTeclado();

		// Processamento
		movimentarTorreDeHanoi(numero, "Torre1", "Torre2", "Torre3");
	}

	private static int lerNumeroDoTeclado() {
		int retorno = 0;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		retorno = leitor.nextInt();
		leitor.close();
		return retorno;
	}

	private static void movimentarTorreDeHanoi(int numero, String origem, String meio, String destino) {
		if (numero > 0) {
			movimentarTorreDeHanoi(numero - 1, origem, destino, meio);
			System.out.println("Movimentar: " + numero + " da " + origem + " para o " + destino);
			movimentarTorreDeHanoi(numero - 1, meio, origem, destino);
		}
	}

}
