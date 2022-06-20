package jana60.persona;

public class Persona {

		/*Creare una classe Persona con attributi nome e cognome e un attributo indirizzo di tipo Indirizzo, dove Indirizzo è un’altra classe caratterizzata dagli attributi: via, numero e città.
In una classe Main di test, utilizzando lo scanner chiedete informazioni all’utente e create due persone diverse con i propri indirizzi. Poi provate a modificare la città di una delle due persone senza che questa modifica influisca con i dati dell’altra persona*/

	// attributi
	  private String nome;
	  private String cognome;
	  private Indirizzo indirizzo;

	  // costruttore
	  public Persona (String nome, String cognome, Indirizzo indirizzo) {
	    this.nome = nome;
	    this.cognome = cognome;
	    this.indirizzo = indirizzo;
	    this.indirizzo = new Indirizzo(indirizzo.getVia(), indirizzo.getNumero(), indirizzo.getCitta());
	  }

	  // metodi getter e setter
	  public String getNome() {
		    return nome;
		  }

		  public void setNome(String nome) {
		    this.nome = nome;
		  }

		  public String getCognome() {
		    return cognome;
		  }

		  public void setCognome(String cognome) {
		    this.cognome = cognome;
		  }

		  public Indirizzo getIndirizzo() {
		    return indirizzo;
		  }

		  public void setIndirizzo(Indirizzo indirizzo) {
		    this.indirizzo = indirizzo;
		  }
}