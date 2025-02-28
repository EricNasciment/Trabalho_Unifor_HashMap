package trabalho_unifor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

	 String path = "C:\\Users\\Optimusprime\\Documents\\arquivos\\trabalhoUnifor.txt";
	 
	 List<String> list = new ArrayList<>();
	 File file = new File(path);
	 
	 try(BufferedReader br = new BufferedReader(new FileReader(path))){
		String line = br.readLine();
		 
		while(line  != null) {
	    String[] field = (line.split(" "));
	    list.addAll(Arrays.asList(field));
	    System.out.println(Arrays.toString(field));
	    line = br.readLine();
	   }
		
		
	}

}
}
