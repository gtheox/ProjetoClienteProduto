package br.com.fiap.beans;

public class Cliente {
	
	//Visibilidade, tipo de dados e atributos
	
	private String nome;
	private int idade;
	private double altura;
	
	// setter (entrada) e getters (exibe/retorna)
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
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
