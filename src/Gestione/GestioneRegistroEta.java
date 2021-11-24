package Gestione;
import java.util.Scanner;
import java.util.Vector;
import java.io.*;

public class GestioneRegistroEta {

	public static void main(String[] args) {
		/*Costruisco l'oggetto per l'input e l'oggetto di tipo
		 * "RegistroEtaCompleto"
		 */
		Scanner input = new Scanner(System.in);
		RegistroEtaCompleto registro = new RegistroEtaCompleto();
		//Vector<String> nomi = new Vector<String>();
		//Vector<Integer> numeri = new Vector<Integer>();

		try {
			System.out.println("Inserisci il nome del file da cui vuoi estrarre le informazioni: ");
			String s = input.nextLine();
			//int next;

			Scanner file_input = new Scanner(new BufferedReader(new FileReader(s)));

			//file_input.useDelimiter(" ");
			while(file_input.hasNext()) {
				String nome = file_input.next();
				int eta = file_input.nextInt();
				NomeEta e = new NomeEta(nome, eta);
				registro.aggiungeElemento(e);
			}
			file_input.close();
		}
		catch(IOException e) {
			System.out.println("ERRORE di I/O");
			System.out.println("Non è stato trovato nessun file con questo nome");
			System.out.println(e);
		}

		int scelta;
		do {
			System.out.println("MENU");
			System.out.println("1) Visualizza registro");
			System.out.println("2) Aggiungi elemento");
			System.out.println("3) Incrementa età");
			System.out.println("4) Salva dati");
			System.out.println("5) Esci");
			System.out.print("Sceta: ");
			scelta = input.nextInt();

			switch(scelta) {
			case 1:
				for(int i = 0; i < registro.noEta.size(); i++) {
					System.out.println(registro.noEta.get(i).getNome()+ " "+ registro.noEta.get(i).getEta());
				}
				break;
			case 2:
				System.out.println("Inserisci nome: ");
				String name = input.next();
				System.out.println("Inserisci età: ");
				int n = input.nextInt();
				NomeEta elemento = new NomeEta(name, n);
				registro.aggiungeElemento(elemento);
				break;
			case 3:
				System.out.println("Inserisci il nome della persona di cui vuoi incrementare l'età: ");
				String nome = input.next();
				registro.cercaElemento(nome);
				break;
			case 4:
				System.out.println("Inserisci il nome del file dove vuoi salvare i dati: ");
				String file = input.next();
				try {
					PrintWriter file_output = new PrintWriter(new BufferedWriter(new FileWriter(file)));
					for(int i = 0; i < registro.noEta.size(); i++) {
						file_output.println(registro.noEta.get(i).getNome()+ " "+ registro.noEta.get(i).getEta());
					}
					file_output.close();
				}
				catch(IOException e) {
					System.out.println("ERRORE con l'I/O");
					System.out.println(e);
				}
				break;
			case 5:
				System.out.println("Arrivederci!");
				return;
			default:
				System.out.println("Carattere non consentito, riprova");
			}
		}while(scelta != 5);
		input.close();
	}

}


