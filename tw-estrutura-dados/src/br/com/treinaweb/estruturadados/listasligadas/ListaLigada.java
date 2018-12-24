package br.com.treinaweb.estruturadados.listasligadas;

public class ListaLigada<T> {

	private No<T> primeiroNo;
	private No<T> ultimoNo;
	private int tamanho;

	public ListaLigada() {
		this.primeiroNo = null;
		this.ultimoNo = null;
	}

}
