package biblioteca;

import java.util.*;

import utility.Validate;

public class Utente implements Validate {
	
	protected String nome, cognome, cf;
	protected Map<String, Libro> prestiti;

	public Utente(){};
	public Utente(String nome, String cognome, String cf) {
		this.nome = nome;
		this.cognome = cognome;
		this.cf=cf;
		prestiti = new HashMap<String, Libro>();
	}

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
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public Map<String, Libro> getPrestiti() {
		return prestiti;
	}
	public void setPrestiti(Map<String, Libro> prestiti) {
		this.prestiti = prestiti;
	}

	@Override
	public boolean isValid() {
		boolean token = false;
		if((!this.nome.isEmpty()&& this.nome!=null)
				&& (!this.cognome.isEmpty()&& this.cognome!=null)
				&& (!this.cf.isEmpty()&& this.cf!=null)){
			token =true;
		}
		return token;
	}	
	
	public int getNumeroLibri(){
		return this.prestiti.size();		
	}
	
	public void aggiungiLibro(Libro l){
		this.prestiti.put(l.getSerialNum(), l);
	}
}
