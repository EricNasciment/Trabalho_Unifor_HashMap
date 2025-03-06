package listaencadeada;

import trabalho_unifor.entities.Palavra;

public class ListaEncadeada<T> {
	
	private No inicio;
	private No fim;
	
	
	
	public void adicionar(Palavra palavra) {
		No celula = new No(palavra);
		
		if(inicio == null) {
			inicio = celula;
		}else {
		 fim.setProximo(celula);
		}
		fim = celula;
		
	}




	@Override
	public String toString() {
		return "ListaEncadeada inicio=" + inicio + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString();
	}
}
