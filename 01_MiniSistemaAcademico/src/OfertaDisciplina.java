import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OfertaDisciplina extends Disciplina {

	private String turno;
	private int semestre;
	private int ano;
	private Curso curso;
	private List<Aluno> alunos;
				
	public OfertaDisciplina(String siglaDisciplina, String nomeDisciplina, String turno, int semestre, int ano) {
		super(siglaDisciplina, nomeDisciplina);
		this.turno = turno;
		this.semestre = semestre;
		this.ano = ano;
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
		//aluno.setOfertaDisciplina(this);
	}
	
	public void listarAlunoPorOferta() {
		for(Aluno a : alunos) {
			System.out.println(a); 
		}
		System.out.println("Total de alunos cadastrados: " + alunos.size());
	}
	
	public void removerAluno(Aluno alunoRemover) {
		this.alunos = this.alunos.stream().filter(aluno -> aluno != alunoRemover)
				.collect(Collectors.toList());
	}
	
	public void removerAlunoPorRa(String ra) {
		for (int i = 0; i < this.alunos.size(); i++) {
			Aluno raAtual = this.alunos.get(i);
			if (raAtual.getRa().equals(ra)) {
				removerAluno(raAtual);
				return;
			}
		}
	}
	
	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Curso getCurso() {
		return curso;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}
	
	public int getQuantidadeDeAlunos() {
		return this.alunos.size();
	}

}
	