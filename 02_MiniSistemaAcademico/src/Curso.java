import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Curso {
	
	private String nomeCurso;
	private String siglaCurso;
	private ArrayList <String> cursos;
	private List<OfertaDisciplina> ofertas;
	//private List<Aluno> alunos;
				
	public Curso(String siglaCurso, String nomeCurso) {
		this.nomeCurso = nomeCurso;
		this.siglaCurso = siglaCurso;
		this.cursos = new ArrayList<String>();
		this.ofertas = new ArrayList<OfertaDisciplina>();
		//this.alunos = new ArrayList<Aluno>();
	}
	
	public void addCurso(String siglaCurso, String nomeCurso) {
		cursos.add(siglaCurso);
	}
	
	public void listarOfertaPorCurso() {
		for(OfertaDisciplina o : ofertas) {
			System.out.println(o); 
		}
		System.out.println("Total de ofertas por curso: " + ofertas.size());
	}
		
	public void removeCurso(String siglaCurso) {
		cursos.remove(siglaCurso);
	}
	
	public void addOfertaDisciplina(OfertaDisciplina oferta) {
		this.ofertas.add(oferta);
		oferta.setCurso(this);
	}
	
	public void removerOferta(OfertaDisciplina ofertaRemover) {
		this.ofertas = this.ofertas.stream().filter(oferta -> oferta != ofertaRemover)
				.collect(Collectors.toList());
	}
	
	public void removerOfertaPorNome(String nomeOferta) {
		for (int i = 0; i < this.ofertas.size(); i++) {
			OfertaDisciplina ofertaAtual = this.ofertas.get(i);
			if (ofertaAtual.getNomeDisciplina().equals(nomeOferta)) {
				removerOferta(ofertaAtual);
				return;
			}
		}
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getSiglaCurso() {
		return siglaCurso;
	}

	public void setSiglaCurso(String siglaCurso) {
		this.siglaCurso = siglaCurso;
	}
	
	public ArrayList<String> getCursos() {
		return cursos;
	}

	public List<OfertaDisciplina> getOfertas() {
		return ofertas;
	}
	
	public int getQuantidadeDeOfertas() {
		return this.ofertas.size();
	}
	
	public int getQtdAlunoCurso() {
		int quantidade = 0;
		for (OfertaDisciplina oferta : this.ofertas) {
			quantidade += oferta.getQuantidadeDeAlunos();
		}
		return quantidade;
	}
	
	@Override
	public String toString() {
		return "SiglaCurso= " + getSiglaCurso() + ", ofertas= " + getOfertas();
	}
	
	
	
}
	
	
	
