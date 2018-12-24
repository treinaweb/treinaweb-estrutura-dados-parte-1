package br.com.treinaweb.estruturadados.listasligadas;

public class ListaLigada<T> {

	private No<T> primeiroNo;
	private No<T> ultimoNo;
	private int tamanho;

	public ListaLigada() {
		this.primeiroNo = null;
		this.ultimoNo = null;
	}

	public void inserir(T elemento) {
		No<T> novoNo = new No<T>(elemento);
		if (estaVazia()) {
			this.primeiroNo = novoNo;
			this.ultimoNo = novoNo;
		} else {
			this.ultimoNo.setProximo(novoNo);
			this.ultimoNo = novoNo;
		}
		this.tamanho++;
	}

	public void inserirEm(int posicao, T elemento) {
		if (posicao >= tamanho()) {
			throw new IllegalArgumentException(String.format("Posição inválida [%d]", posicao));
		}
		if (posicao == 0) {
			No<T> novoNo = new No<T>(elemento);
			novoNo.setProximo(this.primeiroNo);
			this.primeiroNo = novoNo;
		} else if (posicao == this.tamanho() - 1) {
			No<T> novoNo = new No<T>(elemento);
			this.ultimoNo.setProximo(novoNo);
			this.ultimoNo = novoNo;
		} else {
			No<T> noAnterior = recuperarNo(posicao - 1);
			No<T> noAtual = recuperarNo(posicao);
			No<T> novoNo = new No<T>(elemento);
			noAnterior.setProximo(novoNo);
			novoNo.setProximo(noAtual);
		}
		this.tamanho++;
	}

	public T recuperar(int posicao) {
		No<T> no = recuperarNo(posicao);
		if (no != null) {
			return no.getElemento();
		}
		return null;
	}

	public boolean estaVazia() {
		return this.tamanho == 0;
	}

	public int tamanho() {
		return this.tamanho;
	}

	public No<T> recuperarNo(int posicao) {
		if (posicao >= tamanho()) {
			throw new IllegalArgumentException(String.format("Posição inválida [%d]", posicao));
		}
		No<T> resultado = null;
		for (int i = 0; i <= posicao; i++) {
			if (i == 0) {
				resultado = this.primeiroNo;
			} else {
				resultado = resultado.getProximo();
			}
		}
		return resultado;
	}

	@Override
	public String toString() {
		if (estaVazia()) {
			return "Lista []";
		} else {
			No<T> noAtual = this.primeiroNo;
			StringBuilder sb = new StringBuilder();
			sb.append("Lista [");
			sb.append(noAtual.getElemento() != null ? noAtual.getElemento().toString() : "<NULO>");
			sb.append(",");
			while (noAtual.getProximo() != null) {
				sb.append(noAtual.getElemento() != null ? noAtual.getElemento().toString() : "<NULO>");
				sb.append(",");
				noAtual = noAtual.getProximo();
			}
			sb.append("]");
			return sb.toString();
		}
	}

}
