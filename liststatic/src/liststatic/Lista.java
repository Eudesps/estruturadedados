package liststatic;

public class Lista {
	private String[] elementos;
	private int tamanho;
	
	public Lista(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	public void adicionar(String elemento) {
		for(int i=0; i < elementos.length; i++) {
			if(elementos[i].equals(null)) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}
	public boolean adiciona(String elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	/*Imprime, mas com os nulos
	public String toString() {
		return Arrays.toString(elementos);
	}*/
	/*
	public String toString() {
		if(this.tamanho() > 0) {
			String s = "[";
			for(int i = 0; i < tamanho-1; i++) {
				s += this.elementos[i]+", ";
			}
			s += this.elementos[this.tamanho -1] +"]";
			return s;
		}
		return null;
	}*/
	
	public String toString() {
		if(this.tamanho() > 0){
			StringBuilder s = new StringBuilder();
			s.append("[");
			for(int i = 0; i < tamanho-1; i++) {
				s.append(this.elementos[i]);
				s.append(", ");
			}
			s.append(this.elementos[this.tamanho -1]);
			s.append("]");
			return s.toString();
		}
		return null;
	}
	
	public String buscaBasica(int posicao) {
		try {
			return this.elementos[posicao];
		}catch(Exception e){
			return e.getMessage();
		}
	}
	
	public boolean verifica(String elemento) {
		for(int i = 0 ; i < this.tamanho;i++) {
			if(elemento.equalsIgnoreCase(this.elementos[i])) return true;
		}
		return false;
	}
	
	public int verificaOcorrecia(String elemento) {
		int contador = 0;
		for(int i = 0 ; i < this.tamanho;i++) {
			if(elemento.equalsIgnoreCase(this.elementos[i])) {
				contador++;
				if(contador == 2) {
					return i;
				}
			}
		}
		return 0;
	}
	
	public int tamanho(){
		return this.tamanho;
	}
	
	public String[] getElementos() {
		return elementos;
	}

	public void setElementos(String[] elementos) {
		this.elementos = elementos;
	}
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}
