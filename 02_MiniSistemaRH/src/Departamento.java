import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Departamento {
	
	private String nomeDepartamento;
	private List <Departamento> departamentos;
	private List <Funcionario> funcionarios;
	private Funcionario funcionario;
	private Empresa empresas;

	double valorTotal;
	
		
	public Departamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
		this.departamentos = new ArrayList<>();
		this.funcionarios = new ArrayList<>();
	}
	
	public void addFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		funcionario.setDepartamento(this);
	}
	
	public void removerFuncionario(Funcionario funcionarioRemover) {
		this.funcionarios = this.funcionarios.stream().filter(funcionario -> funcionario != funcionarioRemover)
				.collect(Collectors.toList());
	}
	
	public void removerFuncionarioPorNome(String nomeFuncionario) {
		for (int i = 0; i < this.funcionarios.size(); i++) {
			Funcionario funcionarioAtual = this.funcionarios.get(i);
			if (funcionarioAtual.getNomeFuncionario().equals(nomeFuncionario)) {
				removerFuncionario(funcionarioAtual);
				return;
			}
		}
	}
	
	public double getValorTotalDepartamento() {
		for (Funcionario f : funcionarios)
			valorTotal += f.getValorTotal();
		
		return valorTotal;		
	}
	
	public String getNomeDepartamento() {
		return nomeDepartamento;
	}

	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}

	public List<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}	

	public Empresa getEmpresas() {
		return empresas;
	}

	public void setEmpresas(Empresa empresas) {
		this.empresas = empresas;
	}

	@Override
	public String toString() {
		return "\nDepartamento: " + this.getNomeDepartamento() + " " + this.getFuncionarios();
	}
	
	
	
	
}
