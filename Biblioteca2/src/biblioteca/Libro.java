package biblioteca;

import utility.*;

public class Libro implements Validate {
	
	private String titolo, autore, serialNum;
	private int copieTotali=0;
	private int copieDisp=0;
	
	public Libro(){}
	public Libro(String titolo, String autore, String serialNum) {
		this.titolo = titolo;
		this.autore = autore;
		this.serialNum = serialNum;
		this.copieTotali = 0;
		this.copieDisp = 0;
	}

	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String nome) {
		this.titolo = nome;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	public int getCopieTotali() {
		return copieTotali;
	}
	public void setCopieTotali(int copieTotali) {
		this.copieTotali = copieTotali;
	}
	public int getCopieDisp() {
		return copieDisp;
	}
	public void setCopieDisp(int copieDisp) {
		this.copieDisp = copieDisp;
	}

	@Override
	public boolean isValid() {
		boolean token = false;
		if((!titolo.isEmpty() && titolo!=null) 
				&& (!autore.isEmpty() && autore!=null)
				&& (!serialNum.isEmpty() && serialNum!=null)){
			token=true;			
		}		
		return token;
	}
}
