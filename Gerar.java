
public class Gerar  {
	
	public static void main(String[]agrs) {
		
		double comissao= 0;
		
		ControleBonificacao controle01 = new ControleBonificacao();
		Funcionario g1 = new Gerente();
		g1.setSalario(1000);	
		controle01.registrar(g1);
		System.out.println("SOMA DO FUNCIONARIO " + controle01.getSoma());
		
		
		
	}


}
