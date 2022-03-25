import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cliente {

	// Criando variáveis privadas

	private String nome;
	private String email;
	private int agencia;
	private int conta;
	private int telefone;
	private double saldo;

	Scanner teclado = new Scanner(System.in);

	// Criando a ArrayList para armazenar e listar os dados coletados no Scanner do teclado.
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public void Cadastrar() {

		Cliente cli = new Cliente();

		// Capturando as informações do teclado utilizando o set

		System.out.println("Nome Cliente: ");
		cli.setNome(teclado.next());
		System.out.println("E-mail: ");
		cli.setEmail(teclado.next());
		System.out.println("Agência: ");
		cli.setAgencia(teclado.nextInt());
		System.out.println("Conta: ");
		cli.setConta(teclado.nextInt());
		System.out.println("Telefone: ");
		cli.setTelefone(teclado.nextInt());
		System.out.println("Saldo: ");
		cli.setSaldo(teclado.nextDouble());
		System.out.println("");
		System.out.println("CADASTRO EFETUADO!");
		System.out.println("");
		
		clientes.add(cli);

	}

	public void Listar() {
		// TODO Auto-generated method stub

		System.out.println("=====================================");
		System.out.println("		Lista de Clientes");
		System.out.println("=====================================");

		// Laço para pegar os dados 
		for (Cliente cliente : clientes) {

			System.out.println("Cliente: " + cliente.getNome());
			System.out.println("E-mail: " + cliente.getEmail());
			System.out.println("Agência: " + cliente.getAgencia());
			System.out.println("Conta: " + cliente.getConta());
			System.out.println("Telefone: " + cliente.getTelefone());
			System.out.println("Saldo: " + cliente.getSaldo());
			System.out.println("");
			
		}

	}

	public void Gravar() throws IOException {
		// TODO Auto-generated method stub

		FileWriter arquivo = new FileWriter("C:\\Users\\gjefa\\Documents\\clientes.txt");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		gravarArquivo.printf("Cliente cadastrado");

		for (Cliente cliente : clientes) {
			gravarArquivo.printf("Cliente: " + cliente.getNome() + "%n");
			gravarArquivo.printf("E-mail: " + cliente.getEmail() + "%n");
			gravarArquivo.printf("Agência: " + cliente.getAgencia() + "%n");
			gravarArquivo.printf("Conta: " + cliente.getConta() + "%n");
			gravarArquivo.printf("Telefone: " + cliente.getTelefone() + "%n");
			gravarArquivo.printf("Saldo: " + cliente.getSaldo() + "%n");

			arquivo.close();
			System.out.println("O arquivo está sendo gravado na unidade C:\\Users\\gjefa\\Documents\\clientes.txt");
		}

	}

	public void Consultar() {
		// TODO Auto-generated method stub

		String mostra = "";
		String nomeArq = "C:\\Users\\gjefa\\Documents\\clientes.txt";
		String linha = "";

		File arq = new File(nomeArq);

		if (arq.exists()) {
			// Verifica se o arquivo está aberto
			mostra = "Arquivo - " + arq + ", aberto com sucesso";
			System.out.println(mostra);

			// Verifica o tamanho do arquivo
			mostra = "Tamanho do arquivo: " + Long.toString(arq.length());
			System.out.println(mostra);

			// Processo de tentativa de leitura das informações contidas no arquivo
			try {
				FileReader reader = new FileReader(nomeArq);
				BufferedReader leitor = new BufferedReader(reader);

				while (true) {
					linha = leitor.readLine();
					System.out.println(linha);
					if (linha == null)
						break;
					mostra += linha + "\n";
				}
			} catch (Exception erro) {
			}
			JOptionPane.showMessageDialog(null, mostra, "Arquivo...", 1);
			System.out.println("conteúdo existente");

		} else
			JOptionPane.showMessageDialog(null, "Arquivo Inexistente", "Erro", 0);

	}

	// Criando o Contrutor
	public Cliente() {

		this.nome = nome;
		this.email = email;
		this.agencia = agencia;
		this.conta = conta;
		this.telefone = telefone;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
