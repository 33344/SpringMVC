package br.pro.MVC.Controlladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/** 
 * 
 * @author Anderson
 * 
 * mapeia suas classes e metodos
 *
 */
@Controller
@RequestMapping("/MVC")
public class MVController {
	
	@RequestMapping("/Hello/{nome}")
	@ResponseBody // printa na tela o nome
	public String Hello(@PathVariable String nome) {
		
	return "Hello Word" + nome;
		
	}
	

}
