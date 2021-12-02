package Gestione;
import java.util.Vector;

/**
 * Definizione classe RegistroEtaCompleto in cui un vettore
 * ospita tutte le persone
 * @author gians_ji5genm
 *
 */
public class RegistroEtaCompleto {
	Vector<NomeEta> noEta = new Vector<NomeEta>();
	public RegistroEtaCompleto() {
		//new Vector<NomeEta>();
	}
	
	/**
	 * Metodo per aggiungere un nuovo elemento
	 * @param elem di tipo NomeEta
	 */
	public void aggiungeElemento(NomeEta elem) {
		noEta.add(elem);
	}
	
	/**
	 * Metodo per la ricerca di un elemento tramite il nome e
	 * conseguente incremento dell'età
	 * @param nome
	 */
	public void cercaElemento(String nome) {
		for(int i = 0; i < noEta.size(); i++) {
			if(nome.equals(noEta.get(i).getNome())) {
				noEta.get(i).incrementaEta();
			}
		}
		System.out.println("Hai incrementato l'età di "+ nome);
	}
	
	/**
	 * @override toString
	 */
	public String toString() {
		for(int i = 0; i < noEta.size(); i++) {
			return noEta.get(i).getNome() + " "+ noEta.get(i).getEta();
		}
		return null;
	}
	
	/*public void visualizzaRegistro() {
		System.out.println(noEta);
	}*/
}
