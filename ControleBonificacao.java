
public class ControleBonificacao {

	
	private double soma;	
	
	public double getSoma() {
		return soma;
	}
	public void setSoma(double soma) {
		this.soma = soma;
	}

	public void registrar(Funcionario f) {
		double bonificacao = f.bonificacao();
		soma = soma + bonificacao;
	}
}
