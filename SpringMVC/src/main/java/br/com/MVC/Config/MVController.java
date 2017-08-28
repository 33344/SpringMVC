package br.com.MVC.Config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
/** 
 * 
 * @author Anderson
 * 
 * mapeia suas classes e metodos
 *	
 */
@Controller
@RequestMapping("/service")
public class MVController {
	
	@RequestMapping("/hello")
	@ResponseBody // printa na tela o nome
	public String Hello() {
		
		Gson gson = new Gson();
		return gson.toJson("anderson");
		
	}
	

}
