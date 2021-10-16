import java.util.Scanner;

public class Funcionario {
	private String nome;
	private String sobrenome;	
	private String cpf;
	Scanner dadoDeEntrada = new Scanner(System.in);
		
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	public String getSobrenome() { return sobrenome; }
	public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }
	public String getCpf() { return cpf; }
	public void setCpf(String cpf) { this.cpf = cpf; }
	
	public void insereDados() {
		System.out.println("Digite o nome: ");
		nome = dadoDeEntrada.nextLine();
		System.out.println("Digite o sobrenome: ");
		sobrenome = dadoDeEntrada.nextLine();
		System.out.println("Digite o cpf: ");
		cpf = dadoDeEntrada.nextLine();
	}
	
}