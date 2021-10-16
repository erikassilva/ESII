import java.util.ArrayList;

public class APP {

	public static void main(String[] args) {
		
		Curso c1 = new Curso("ADS", "Análise e desenvolvimento de sistemas");
		Curso c2 = new Curso ("AGRO", "Agronegócio");
		ArrayList<Curso> c = new ArrayList<Curso>();
		
		OfertaDisciplina od1 = new OfertaDisciplina("ESII", "Engenharia de Software II", "Noturno", 2, 2021);
		OfertaDisciplina od2 = new OfertaDisciplina("IED", "Estrutura de Dados", "Noturno", 2, 2021);
		
		Aluno a1 = new Aluno("Julio Cesar", "123456", c1);
		Aluno a2 = new Aluno("Erika Silva", "654321", c1);
		Aluno a3 = new Aluno("Ilca Silva", "654321", c2);
		
		c.add(c1);
		c.add(c2);
		c2.removeCurso("AGRO");

		c1.addOfertaDisciplina(od1);
		c2.addOfertaDisciplina(od1);
		c1.addOfertaDisciplina(od2);
		c2.removerOferta(od1);
		
				
		od1.addAluno(a1);
		od1.addAluno(a2);
		od1.addAluno(a3);
		od1.removerAlunoPorRa("123456");
		od2.addAluno(a3);
		
		
		System.out.println("O curso " + c1.getSiglaCurso() + " possui " + c1.getQuantidadeDeOfertas() + " ofertas vigente.");
		System.out.println("O curso " + c2.getSiglaCurso() + " possui " + c2.getQuantidadeDeOfertas() + " ofertas vigentes.");
		System.out.println("A oferta de disciplina " + od1.getSiglaDisciplina() + " possui " + od1.getQuantidadeDeAlunos() + " alunos cadastrados.");
		System.out.println("A oferta de disciplina " + od2.getSiglaDisciplina() + " possui " + od2.getQuantidadeDeAlunos() + " alunos cadastrados.");
	}
}
