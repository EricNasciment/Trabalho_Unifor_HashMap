package listaencadeada;

public class No <T> {
	
	private  T elemento;
    private No proximo;
    
	public No(T elemento, No proximo) {
		super();
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public No(T elemento) {
		super();
		this.elemento = elemento;
		this.proximo = null;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
	}
    
			
    
    
}
