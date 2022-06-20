package jana60.persona;

public class Indirizzo {

	 private String via;
	  private int numero;
	  private String citta;

	  // costruttore
	  public Indirizzo (String via, int numero, String citta) {
	    this.via = via;
	    this.numero = numero;
	    this.citta = citta;
	  }

	  // metodi getter e setter
	  public String getVia() {
		    return via;
		  }

		  public void setVia(String via) {
		    this.via = via;
		  }

		  public int getNumero() {
		    return numero;
		  }

		  public void setNumero(int numero) {
		    this.numero = numero;
		  }

		  public String getCitta() {
		    return citta;
		  }

		  public void setCitta(String citta) {
		    this.citta = citta;
		  }
}

