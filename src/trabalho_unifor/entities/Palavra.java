package trabalho_unifor.entities;

public class Palavra {

	private String palavra;
	private Ocorrencias ocorrencias;
	
	
	public Palavra(String palavra, Ocorrencias ocorrencias) {
		super();
		this.palavra = palavra;
		this.ocorrencias = ocorrencias;
	}


	public String getPalavra() {
		return palavra;
	}


	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}


	public Ocorrencias getOcorrencias() {
		return ocorrencias;
	}


	public void setOcorrencias(Ocorrencias ocorrencias) {
		this.ocorrencias = ocorrencias;
	}
	
	
	
	
	
}
