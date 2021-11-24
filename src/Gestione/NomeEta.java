package Gestione;

//Definizione classe
public class NomeEta {
	private String nome;
	private int eta;
	
	//Costruttore
	public NomeEta(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}
	
	//Vari metodi get e set
	public String getNome() {
		return nome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public void incrementaEta() {
		++eta;
	}
}
