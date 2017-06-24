package br.com.MVC.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 
 * @author Anderson
 * classe de configuração e busca de xml 
 *
 */

@EnableWebMvc
@Configuration
//procura as annotetions 
@ComponentScan(basePackages = "br.com.MVC") 
public class Configuracoes extends WebMvcConfigurerAdapter {

	
}
