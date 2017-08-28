package br.com.MVC.Config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/traducao")
public class ControllerTraslator {
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String liString(){
		
		
		return "index";
	}
	

}
