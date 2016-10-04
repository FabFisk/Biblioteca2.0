package biblioteca;

import java.util.Date;

public class Prestito {
	
	private Libro l;
	private Utente u;
	private Date prestito;
	private Date restituzione;
	private Date scadenza;
	
	public Prestito(){}
	public Prestito(Utente u, Libro l, Date prestito, Date scadenza){
		this.l = l;
		this.u = u;
		this.prestito = prestito;
		this.scadenza = scadenza;		
	}
	public Prestito(Utente u, Libro l, Date prestito, 
			Date restituzione, Date scadenza){
		this.l = l;
		this.u = u;
		this.prestito = prestito;
		this.restituzione = restituzione;
		this.setScadenza(scadenza);
	}

	public Libro getL() {
		return l;
	}
	public void setL(Libro l) {
		this.l = l;
	}
	public Utente getU() {
		return u;
	}
	public void setU(Utente u) {
		this.u = u;
	}
	public Date getPrestito() {
		return prestito;
	}
	public void setPrestito(Date prestito) {
		this.prestito = prestito;
	}
	public Date getRestituzione() {
		return restituzione;
	}
	public void setRestituzione(Date restituzione) {
		this.restituzione = restituzione;
	}
	public Date getScadenza() {
		return scadenza;
	}
	public void setScadenza(Date scadenza) {
		this.scadenza = scadenza;
	}
}
