
public class Funcionario {

	private String nome;
	private String cpf;
	private String cargo;
	private double salario;
	
	public double bonificacao() {
		return this.salario= this.salario + 100;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
		
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	
}
