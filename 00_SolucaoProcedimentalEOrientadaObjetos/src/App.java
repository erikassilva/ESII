public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f = new Funcionario();
		CalculoSalario cs = new CalculoSalario();
		Imprimir resultado = new Imprimir();
				
		f.insereDados();
		cs.informaHorasTrabalhadas();
		cs.getCalculaSalario(f);
		resultado.imprimir(f, cs);
	}
}
