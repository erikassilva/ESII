import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nomeAluno;
	private String ra;
	private Curso curso;
	//private OfertaDisciplina ofertaDisciplina;
	private List<Aluno> alunos;	
	
	public Aluno(String nomeAluno, String ra, Curso curso) {
		this.nomeAluno = nomeAluno;
		this.ra = ra;
		this.curso = curso;
		this.alunos = new ArrayList<Aluno>();
	}
	
	public String getNomeAluno() { return nomeAluno; }
	public void setNomeAluno(String nomeAluno) { this.nomeAluno = nomeAluno; }
	public String getRa() { return ra; }
	public void setRa(String ra) { this.ra = ra; }
	public Curso getCurso() { return curso; }
	public void setCurso(Curso curso) { this.curso = curso; }
	//public void setOfertaDisciplina(OfertaDisciplina ofertaDisciplina) { this.ofertaDisciplina = ofertaDisciplina; }

	public List<Aluno> getAlunos() { return alunos; }
	
	
	
}
