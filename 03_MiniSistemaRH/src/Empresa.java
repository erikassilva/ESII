import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Empresa {
	
	private String nomeEmpresa;
	private List <Departamento> departamentos;

	public Empresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
		this.departamentos = new ArrayList<>();
	}
	
	public void addDepartamento(Departamento departamento) {
		this.departamentos.add(departamento);
		departamento.setEmpresas(this);
	}
	
	public void removerDepartamento(Departamento departamentoRemover) {
		this.departamentos = this.departamentos.stream().filter(departamento -> departamento != departamentoRemover)
				.collect(Collectors.toList());
	}
	
	public void removerDepartamentoPorNome(String nomeDepartamento) {
		for (int i = 0; i < this.departamentos.size(); i++) {
			Departamento departamentoAtual = this.departamentos.get(i);
			if (departamentoAtual.getNomeDepartamento().equals(nomeDepartamento)) {
				removerDepartamento(departamentoAtual);
				return;
			}
		}
	}
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public List<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNomeEmpresa() + "Departamento: " + this.getDepartamentos();
	}
	
	
		
}