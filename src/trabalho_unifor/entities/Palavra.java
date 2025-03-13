package trabalho_unifor.entities;

public class Palavra {

	private String palavra;
	private int ocorrencias;
	
public Palavra() {
		
		
	}

	public Palavra(String palavra) {
		
		this.palavra = palavra;
		this.ocorrencias = 0;
	}

	public Palavra(String palavra, int ocorrencias) {
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

	public int getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(int ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

	@Override
	public String toString() {
		return "Palavra palavra=" + palavra + "," + ocorrencias ;
	}
	
	
	
	
}
