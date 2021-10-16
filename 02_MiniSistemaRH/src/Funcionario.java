public class Funcionario {
	
	private String nomeFuncionario;
	private String cargo;
	private double salario;
	private Departamento departamento;
	
	public Funcionario(String nomeFuncionario, String cargo, double salario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.cargo = cargo;
		this.salario = salario;
	}

	public void moverPara(Departamento novoDepartamento) {
		if (this.departamento != null) {
			this.departamento.removerFuncionario(this);
		}
		if (novoDepartamento != null) {
			novoDepartamento.addFuncionario(this);
		}
	}
	
	public double getValorTotal() {
		this.salario = salario++;
		return salario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "\nNome:" + this.nomeFuncionario + "\tCargo: " + this.cargo + "\tSalário: " + this.getSalario() + "";
	}

	
	
	
	
}