package br.com.MVC.teste;

import br.com.MVC.util.Traslator;

public class TraslateTeste {
	
	public static void main(String[] args) throws Exception {
	    // api de tradução
	   
		String fromLang = "en";
	    String toLang = "pt";
	    String text = "Specify your translation requirements here";

	    Traslator.translate(fromLang, toLang, text);
	
	}

}
