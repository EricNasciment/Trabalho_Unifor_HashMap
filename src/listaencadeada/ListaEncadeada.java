package listaencadeada;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import trabalho_unifor.entities.Palavra;

public class ListaEncadeada <T> {
	
	private No inicio;
	private No fim;

	Map<String,Palavra> mp = new HashMap<>();	
	
	
	
	public void adicionar(Palavra palavra) {
		No celula = new No(palavra);
		
		if(inicio == null) {
			inicio = celula;
		}else {
		 fim.setProximo(celula);
		}
		fim = celula;
		
		mp.put(palavra.getPalavra(), palavra);
	}
     
	public void verificarPalavra(Palavra palavra) {
     
     Palavra palavras = mp.get(palavra.getPalavra());
     
     if(palavras != null) {
    	Indice(palavra);
     }
  
    }
	
	public void Indice(Palavra palavra) {
		for(int i = 'a' ; i <= 'z'; i++) {
			if(palavra.getPalavra().charAt(0) == i) {
				System.out.println(i + ": " + palavra.getPalavra() + "[ " + palavra.getOcorrencias() + " ]");
			}
		}
	}
   
	
	
	private Palavra instanciarPalavra(String palavra,Integer ocorrencia) {
	Palavra instanciaPalavras = new Palavra(palavra,ocorrencia);
	return instanciaPalavras;
   }
	
    @Override
	public String toString() {
		return "ListaEncadeada inicio=" + inicio + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString();
	}
}
