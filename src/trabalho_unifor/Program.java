package trabalho_unifor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import listaencadeada.ListaEncadeada;
import trabalho_unifor.entities.Palavra;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

	 String path = "C:\\Users\\Optimusprime\\Documents\\arquivos\\trabalhoUnifor.txt";
	 File file = new File(path);
	 
	 
	 Map<String, Palavra> palavrasMap = new HashMap<>();
	 
	 try(BufferedReader br = new BufferedReader(new FileReader(path))){
		String line = br.readLine();
		 
		
		ListaEncadeada<Palavra> lista = new ListaEncadeada<>();
		Palavra p = new Palavra();
		int linha = 0;
		
		while(line  != null) {
			linha++;
	    String[] field = line.split("\\s+");
	    for(String palavra : field) {
           p = new Palavra(palavra,linha);	    
	    	lista.adicionar(p);
	    	 lista.verificarPalavra(p);
	    	
	    }
	    //System.out.println(Arrays.toString(field));
	   
	    line = br.readLine();
	   
	   }
		
		
			
		
		
      
	}

}
}
