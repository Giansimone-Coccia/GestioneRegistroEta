package Gestione;
import java.util.Vector;

//Definizione classe
public class RegistroEtaCompleto {
	Vector<NomeEta> noEta = new Vector<NomeEta>();
	public RegistroEtaCompleto() {
		//new Vector<NomeEta>();
	}
	
	//Metodo per aggiungere un nuovo elemento
	public void aggiungeElemento(NomeEta elem) {
		noEta.add(elem);
	}
	
	/*Metodo per la ricerca di un elemento tramite il nome e
	 * conseguente incremento dell'età
	 */
	public void cercaElemento(String nome) {
		for(int i = 0; i < noEta.size(); i++) {
			if(nome.equals(noEta.get(i).getNome())) {
				noEta.get(i).incrementaEta();
			}
		}
		System.out.println("Hai incrementato l'età di "+ nome);
	}
	
	//@override toString
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
