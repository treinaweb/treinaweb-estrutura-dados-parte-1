package br.com.treinaweb.estruturadados.vetores;

public class Vetor<T> {

	private Object[] elementos;

	public Vetor(int capacidade) {
		this.elementos = new Object[capacidade];
	}

	public void inserirEm(int posicao, T elemento) {
		this.elementos[posicao] = elemento;
	}

	@SuppressWarnings("unchecked")
	public T recuperar(int posicao) {
		return (T) this.elementos[posicao];
	}

}
