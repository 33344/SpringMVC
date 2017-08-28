package br.com.MVC.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LerArquivo {

	public void read(File file) throws IOException {
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		String data = null;
		while ((data = reader.readLine()) != null) {
			System.out.println(data);
		}
		fileReader.close();
		reader.close();
	}

	
	public void escrever() throws IOException {
		
		File arquivo1 = new File("C:\\Users\\Ragnar\\Desktop\\bootstrap-3.3.7-dist\\andeson.txt");
		File arquivo2 = new File("C:\\Users\\Ragnar\\Desktop\\bootstrap-3.3.7-dist\\gabarito.txt");
	
			arquivo2.createNewFile();
			FileReader fileR = new FileReader(arquivo1);
			BufferedReader buffR = new BufferedReader(fileR);
			FileWriter fileW = new FileWriter(arquivo2);// arquivo para escrita
			BufferedWriter buffW = new BufferedWriter(fileW);
		
			while (buffR.ready()) {	
				buffW.write(buffR.readLine());
				buffW.newLine();
			}
			
			buffR.close();
			buffW.close();
		
	}
}