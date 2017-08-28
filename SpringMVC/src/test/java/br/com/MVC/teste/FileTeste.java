package br.com.MVC.teste;


import java.io.IOException;

import br.com.MVC.util.LerArquivo;

public class FileTeste {

	public static void main(String[] args) {

		LerArquivo arquivo = new LerArquivo();

		try {
			//arquivo.read(new File("C:\\Users\\Ragnar\\Desktop\\bootstrap-3.3.7-dist\\andeson.txt"));
			
			arquivo.escrever();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}
	
	

}
