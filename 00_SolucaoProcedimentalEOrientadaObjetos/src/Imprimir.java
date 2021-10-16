public class Imprimir {
	
	public void imprimir(Funcionario f, CalculoSalario cs) {
	
	System.out.println("-------------------Cálculo de Salário de funcionários horistas-------------------------------------------");
	System.out.println("Nome funcionário: " + f.getNome() + " " + f.getSobrenome() + "\n" + "CPF: " + f.getCpf());
	System.out.println("Valor Hora Trabalhada: " + cs.getValorHoraTrabalhada() + "\n" + "Quantidade Horas Trabalhadas: " 
			+ cs.getQuantidadeHoraTrabalhada() + "\n" + "Salário a Pagar: " + cs.getCalculaSalario(f));
	System.out.println("-------------------FIM do Cálculo de Salário de funcionários horistas------------------------------------");
	}
}
