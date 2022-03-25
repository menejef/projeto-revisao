import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ControleCorrentista {

	public static void main(String[] args) throws IOException {
		// Criando Scanner para coletar os dados digitado
		Scanner teclado = new Scanner(System.in);

		// Declarando variavel
		int opcao = 0;

		Cliente cliente = new Cliente(); // Instancia a classe cliente para trabalhar na pagina principal

		do {

			System.out.println("=====================================");
			System.out.println("	Bem-vindo ao Banco Itaú.");
			System.out.println("=====================================");
			System.out.println(" 1 - Cadastrar Clientes");
			System.out.println(" 2 - Listar Clientes");
			System.out.println(" 3 - Gravar em arquivo texto");
			System.out.println(" 4 - Consultar arquivo texto");
			System.out.println(" 5 - Sair");
			System.out.println("=====================================");
			System.out.println("Digite a opção desejada:");
			System.out.println("=====================================");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:

				cliente.Cadastrar();

				break;
			case 2:

				cliente.Listar();
				

				break;
			case 3:

				cliente.Gravar();

				break;
			case 4:

				cliente.Consultar();

				break;
	
			case 5:
				System.out.println("Sessão encerrada.");
				return;
				
			default:
				System.out.println("Opção inválida! Digite a opção correta do menu. ");
				System.out.println("");

			}
		} while (opcao >= 1 || opcao <= 4);

	}

}