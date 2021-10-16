import java.util.Scanner;

public class CalculoSalario {
		
	private double valorHoraTrabalhada = 81.25;
	private int quantidadeHoraTrabalhada;
	private double salarioAPagar;
	Scanner dadoDeEntrada = new Scanner(System.in);
	
	public double getValorHoraTrabalhada() { return valorHoraTrabalhada; }
	public int getQuantidadeHoraTrabalhada() { return quantidadeHoraTrabalhada; }
	public void setQuantidadeHoraTrabalhada(int quantidadeHoraTrabalhada) { this.quantidadeHoraTrabalhada = quantidadeHoraTrabalhada; }
	
	public void informaHorasTrabalhadas() {
		System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
		quantidadeHoraTrabalhada = dadoDeEntrada.nextInt();
	}
	
	public double getCalculaSalario(Funcionario f) {
		salarioAPagar = getValorHoraTrabalhada() * getQuantidadeHoraTrabalhada();
		return salarioAPagar;
	}
}