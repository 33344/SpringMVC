package br.com.MVC.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class teste {
	
	public static void main(String[] args) {
		
	       /* try {
	            //Whatever the file path is.
	            File statText = new File("C:\\Apps\\teto.txt");
	            FileOutputStream is = new FileOutputStream(statText);
	            OutputStreamWriter osw = new OutputStreamWriter(is);    
	            Writer w = new BufferedWriter(osw);
	            w.write("andersonO!!!");
	            w.close();
	        } catch (IOException e) {
	            System.err.println("Problem writing to the file statsTest.txt");
	        }*/
		
		 try {
		        Files.write(Paths.get("C:\\Apps\\teto.txt"), " Gaby do poderoso".getBytes(), StandardOpenOption.APPEND);
		    } catch (IOException e) {
		        e.printStackTrace();
		    } 
	}

}
