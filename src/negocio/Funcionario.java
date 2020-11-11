package negocio;

import auxiliar.Constante;

public abstract class Funcionario {
	private String nome;
	private int idade;
	private float salario;

	public Funcionario(){
		//
	}
	
	public Funcionario(String nome, int idade) {
		this();
		this.nome = nome;
		this.idade = idade;
	}

	public Funcionario(String nome, int idade, float salario) {
		this(nome, idade);
		this.salario = salario;
	}

	protected String obterSituacao(float sl){

		if(sl < Constante.SALARIO_LIMITE_POBRE) {
			return "pobre";
		}else if (sl >= Constante.SALARIO_LIMITE_RICO) {
			return "rico";
		}else {
			return "classe média";
		}
	}
	
	public void exibir() {
		System.out.println("Funcionário: " + this.toString());
	}
	
	@Override
	public String toString() {

		return String.format("%-15s | %03d | %10.2f", 
					this.nome, 
					this.idade, 
					this.salario
				);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}