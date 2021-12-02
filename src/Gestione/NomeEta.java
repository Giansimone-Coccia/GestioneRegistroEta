package Gestione;

/**
 * Definizione classe NomeEta
 * @author gians_ji5genm
 *
 */
public class NomeEta {
	private String nome;
	private int eta;
	
	/**
	 * Costruttore
	 * @param nome Nome persona
	 * @param eta Età persona
	 */
	public NomeEta(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}
	
	/**
	 * Metodo per ottenere il nome
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Metodo per ottenere l'età
	 * @return eta
	 */
	public int getEta() {
		return eta;
	}
	/**
	 * Metodo per settare il nome
	 * @param nome persona
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Metodo per settare l'età
	 * @param eta persona
	 */
	public void setEta(int eta) {
		this.eta = eta;
	}
	/**
	 * Incrementa l'età
	 */
	public void incrementaEta() {
		++eta;
	}
}
