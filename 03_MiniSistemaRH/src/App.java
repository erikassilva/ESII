import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Empresa e1 = new Empresa("Fatec");
		Empresa e2 = new Empresa("SoIlusao");
		Empresa e3 = new Empresa("NaVoltaAGenteCompra");
		ArrayList <Empresa> e = new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.remove(e1);		
			
		Funcionario f1 = new Funcionario("Erika Silva", "Analista", 1000.00);
		Funcionario f2 = new Funcionario("Julio Cesar", "Técnico", 2000.00 );
		Funcionario f3 = new Funcionario("Ilca Silva", "Especialista", 5000.00 );
		ArrayList <Funcionario> f = new ArrayList<>();
		f.add(f1);
		f.add(f2);
		f.add(f3);
		
		Departamento d1 = new Departamento("Engenharia");
		Departamento d2 = new Departamento("Marketing"); 
		
		e1.addDepartamento(d1);
		e3.addDepartamento(d2);
		
			
		d1.addFuncionario(f1);
		d1.addFuncionario(f2);
		d1.removerFuncionario(f2);
		d1.addFuncionario(f2);
		d1.addFuncionario(f3);
		
		d2.addFuncionario(f2);
		d2.removerFuncionarioPorNome("Julio Cesar");
		
		f1.moverPara(d2);
		
		System.out.println("Lista de empresas cadastradas: " + e1 + " - " + e2 + " - " + e3 + "\n");
		System.out.println("----------------------------------------------------------------------------\n");
		System.out.println("Lista de Funcionários da Empresa: " + f);
		System.out.println("----------------------------------------------------------------------------\n");
		System.out.println("Lista de Funcionários por Departamento: \n");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("----------------------------------------------------------------------------\n");
		System.out.println("Custo por Departamento: \n");
		System.out.println("O custo do departamento "+ d1.getNomeDepartamento() + " é BRL " + d1.getValorTotalDepartamento());
		System.out.println("O custo do departamento "+ d2.getNomeDepartamento() + " é BRL " + d2.getValorTotalDepartamento());
	
	}

}
